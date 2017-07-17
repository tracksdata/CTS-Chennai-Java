package com;

import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class CallableDemo {

	public static void main(String[] args) {

		try {

			Properties props = new Properties();
			FileInputStream fis = new FileInputStream("src/data.properties");

			props.load(fis);

			Class.forName(props.getProperty("driverClass"));

			Connection con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("userName"),
					props.getProperty("password"));
			
			
			CallableStatement cs=con.prepareCall("{ call s1(?)}");

			cs.registerOutParameter(1,Types.INTEGER);
			
			cs.execute();
			
			int maxSal= cs.getInt(1);
			
			System.out.println(maxSal);
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
