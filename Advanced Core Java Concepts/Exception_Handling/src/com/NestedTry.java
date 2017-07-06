package com;

public class NestedTry {

	public static void main(String[] args) {

		try {

			int var = 12;

			try {
				System.out.println("Block 1");
			} catch (Exception e) {
				System.out.println("Inner Catch");
			}

			System.out.println("Block 2");

		} catch (Exception e) {
			System.out.println("Outer Catch");
		}

	}

}
