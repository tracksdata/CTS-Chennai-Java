package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class StatementDemo {

	public static void main(String[] args) {

		try {

			Properties props = new Properties();
			FileInputStream fis = new FileInputStream("src/data.properties");

			props.load(fis);
			
			Class.forName(props.getProperty("driverClass"));

			Connection con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("userName"),
					props.getProperty("password"));

			Statement stmt=con.createStatement();
			
			String qry1="insert into product values('P011','Blue Pen',24)";
			String qry2="delete from product where product_id='P004'";
			String qry3="update  product set product_name='Iphone8',price=95000 where product_id='P008'";
			
			
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
			
			System.out.println("---- Done----");
			
			
			

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
