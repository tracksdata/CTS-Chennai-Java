package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ser {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Praveen", 3847384);
		Employee e2 = new Employee(11, "Ruth", 8458648);
		e1.setInfo("Info about e1 obj");

		try {
			FileOutputStream fis = new FileOutputStream("d:/aa/emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fis);

			oos.writeObject(e1);
			System.out.println("-- Writing is done");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
