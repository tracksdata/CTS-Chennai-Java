package com.emp.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.Employee;

public class EmployeeUtil {

	static List<Employee> emps = null;

	public static List<Employee> getEmpList() {

		if (emps == null) {
			emps = new ArrayList<>();
		}
		return emps;

	}

	public static void backUpRecords(List<Employee> emps) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("d:/empdata.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emps);
			System.out.println("--- Records Backed upo Succcess ");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	} // end of ser

	@SuppressWarnings("unchecked")
	public static List<Employee> restoreRecords() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<Employee> emps = null;
		try {

			fis = new FileInputStream("d:/empdata.txt");
			ois = new ObjectInputStream(fis);
			emps = (List<Employee>) ois.readObject();
			System.out.println(emps.size()+" records restored");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {

		}

		return emps;

	}

}
