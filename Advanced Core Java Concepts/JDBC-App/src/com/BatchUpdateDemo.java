package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class BatchUpdateDemo {

	public static void main(String[] args) {

		try {

			Properties props = new Properties();
			FileInputStream fis = new FileInputStream("src/data.properties");

			props.load(fis);

			Class.forName(props.getProperty("driverClass"));

			Connection con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("userName"),
					props.getProperty("password"));
			con.setAutoCommit(false);

			Statement stmt = con.createStatement();

			String q1 = "insert into product values('P1025','New Bag',65)";
			String q2 = "update product set product_name='Watch' where product_id='P001'";
			String q3 = "delete from product where product_id='P010'";

			stmt.addBatch(q1);// zero index
			stmt.addBatch(q2);// 1 index
			stmt.addBatch(q3);// 2nd index

			int res[] = stmt.executeBatch();
			int count = 0;
			for (int x : res) {
				if (x == 1)
					count++;
			}
			
			System.out.println(count + " Statement executed successfully");
			
			boolean flag=true;
			for(int i=0;i<res.length;i++) {
				if(res[i]==0) 
					flag=false;	
			}
			
			if(flag==true) {
				con.commit();
			}else {
				con.rollback();
			}
			
		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
