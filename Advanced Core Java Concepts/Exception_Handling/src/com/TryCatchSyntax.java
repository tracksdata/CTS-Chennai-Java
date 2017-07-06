package com;

class Emp {
	void work() {
		System.out.println("Emp Work");
	}
}

public class TryCatchSyntax {

	public static void main(String[] args) {

		System.out.println("A");

		try {

			System.out.println("B");

			int arith = 1 / 1; // JRE will create AE object.

			int[] array = { 1, 2, 3 };
			System.out.println("Array Value:" + array[1]); // will raise AIOBE

			Emp emp = null;
			emp.work();

			System.out.println("C");

		} catch (ArithmeticException e) {
			System.out.println("Solution To Divide By Zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Solution To Index Problem");
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

		System.out.println("D");

	}
}
