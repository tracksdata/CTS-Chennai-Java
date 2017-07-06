package com;

import java.util.Scanner;

public class ExceptionHandlerDemo {

	public static void main(String[] args) {

		System.out.println("A");

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Enter Num1");
			int num1 = scanner.nextInt();
			System.out.println("Enter Num2");
			int num2 = scanner.nextInt();

			int res = num1 / num2;
			System.out.println("Result:" + res);

		} catch (Exception e) {

			// Soln To Exception:
			// Log It
			// Display Meaningful error Msg To End User
			// Re-Run task with New Input.
			System.out.println("Exception:" + e.getMessage());

		}

		System.out.println("B");

	}
}
