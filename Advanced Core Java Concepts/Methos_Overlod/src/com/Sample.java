package com;

public class Sample {

	void fun() {

	}

	void fun(int x) {
		System.out.println("int: x " + x);
	}
	
	/*int fun(int x) {
		
		return x;
	}*/ // Invalid

	void fun(byte x) {
		System.out.println("byte: x " + x);
	}

	/*
	 * void fun(short x) { System.out.println("short: x " + x); }
	 */

	/*
	 * void fun(long x) { System.out.println("long: x " + x); }
	 */

	/*
	 * void fun(float x) { System.out.println("float x: " + x); }
	 */

	void fun(double x) {
		System.out.println("double x: " + x);
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		// s.fun(100); // int
		// s.fun(65l); //long
		// s.fun((short)87); // short
		// s.fun((byte)32); // byte

		/*
		 * long i=2147483648L;
		 * 
		 * double f=876.45;
		 */

		System.out.println("I= " + i);

		// s.fun(76.45f);

	}

}
