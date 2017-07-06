package com;

// Read File and Return

class FR {

	public String readFile() {

		try {

			// Open File
			System.out.println("Open File");
			// Read File
			System.out.println("Read File");
			int a = 1 / 1;
			String data = "WELCOME";
			// // Close File
			// System.out.println("Close");
			// Return Data
			return data;

		} catch (Exception e) {
			System.out.println("File Read Error");
			//
			// // Close File
			// System.out.println("Close");
			//
			return null;
		} finally {

			// Close File
			System.out.println("Close");
		}

	}

}

public class TryCatchFinally {

	public static void main(String[] args) {

		FR fr = new FR();
		String fileData = fr.readFile();
		System.out.println("-----------");
		System.out.println(fileData);

		try {

			// do some
			int a = 1 / 0;

		} finally {
			System.out.println("Finally Block");
		}

		try {

		} catch (Exception e) {
		} finally {

		}

	}

}
