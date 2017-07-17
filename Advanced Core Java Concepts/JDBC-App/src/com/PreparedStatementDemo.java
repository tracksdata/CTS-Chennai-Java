package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		try {

			Properties props = new Properties();
			FileInputStream fis = new FileInputStream("src/data.properties");

			props.load(fis);

			Class.forName(props.getProperty("driverClass"));

			Connection con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("userName"),
					props.getProperty("password"));

			String qry = "update product set product_name=? where price<=?";

			PreparedStatement ps = con.prepareStatement(qry);

			ps.setString(1, "New One");
			ps.setDouble(2, 1000);

			int x = ps.executeUpdate();
			if (x != 0)
				System.out.println(x + " records effected");
			else
				System.out.println("Nothing to Update: " + x + " rows effected");

			if (x != 0)
				con.commit();

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
