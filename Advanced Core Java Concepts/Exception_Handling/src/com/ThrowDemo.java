package com;

import java.util.Scanner;

class InvalidAgeException extends Exception {

	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String getMessage() {
		return "Invalid Age: " + this.getAge();
	}

}

class UserRegister {

	public void registerYoueAge(int age) throws Exception {

		// ---------

		// ---------

		if (age < 1) {
			InvalidAgeException iae = new InvalidAgeException();
			iae.setAge(age);
			throw iae;
		}

	}

}

public class ThrowDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your age");

		int age = scanner.nextInt();

		UserRegister ur = new UserRegister();
		try {
			ur.registerYoueAge(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
