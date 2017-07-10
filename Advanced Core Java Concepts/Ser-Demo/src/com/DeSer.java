package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSer {

	public static void main(String[] args) {

		Employee emp = null;

		try {
			
			FileInputStream fis=new FileInputStream("d:/aa/emp.txt");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			emp= (Employee)ois.readObject();
			
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getInfo());
			
			
			
			

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
