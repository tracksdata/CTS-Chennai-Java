package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class JdbcTest {

	public static void main(String[] args) {
		
		
		
		
		String clsName="com.mysql.jdbc.Driver";
		try {
			
			Properties props=new Properties();
			FileInputStream fis=new FileInputStream("src/data.properties");
			
			
			props.load(fis);
			
			
			
			/*OracleDriver od=new OracleDriver();
			DriverManager.registerDriver(od);*/
			//DriverManager.registerDriver(new OracleDriver());
			Class.forName(props.getProperty("driverClass"));
			// static
			System.out.println("--- Driver class loaded");
			
			Connection con=DriverManager.getConnection(props.getProperty("url"),props.getProperty("userName"),props.getProperty("password"));
			System.out.println("--- Connection Established "+con);
			
			
			
		} catch (Exception e) {
			System.out.println("--- Failed due to "+e);
		}
		

	}

}
