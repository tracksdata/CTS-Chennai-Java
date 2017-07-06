package com;

import java.util.Scanner;

/*
 *  Task : Read File and Display in screen
 *  ----------------------------------------
 *  
 *   1. Get File Loc
 *   if
 *   2. Check Permission
 *   if
 *   3. Create Read Stream
 *   if
 *   4. Create Buffer
 *   if
 *   5. Read File to Buffer to Java
 *   if
 *   6. display
 *   if
 *   7. Close
 *   if
 *   8. commit
 * 
 * 
 */

class Calc {

	public int div(int num1, int num2) {

		int res = 0;

		if (num2 != 0)  // Error Handling Code
			res = num1 / num2;  // Business Logic Code

		return res;

	}

}

public class Arithmatic {

	public static void main(String[] args) {

		// Work 1

		System.out.println("Work 1......");

		Calc calc = new Calc();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Num1");
		int num1 = scanner.nextInt();

		System.out.println("Enter Num2");
		int num2 = scanner.nextInt();

		int result = calc.div(num1, num2);

		System.out.println("The Result is:" + result);

		// Work 2

		System.out.println("Work 2....");

	}

}
