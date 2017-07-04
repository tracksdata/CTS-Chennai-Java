package com;

public class Sample {

	void fun() {

	}

	void fun(int x) {
		System.out.println("int: x " + x);
	}

	/*
	 * int fun(int x) {
	 * 
	 * return x; }
	 */ // Invalid

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
		 * int x=10; //int y=2;
		 * 
		 * x=x+10; x+=10;
		 */

		int obj[] = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 5 };
		// int j[10]; // Invalid in java

		// int arrayObj[]=new int[10];
		// int []arrayObj=new int[10];
		int[] arrayObj = new int[10];
		arrayObj[2] = 65;

		/*
		 * for(int i=0;i<obj.length;i++) { System.out.println(obj[i]);
		 * 
		 * }
		 */

		// String[] names= {"ABC","Xyz","test","fun"};
		Integer[] names = { 1, 2, 3, 4, 5, 6, 7 };

		/*
		 * for(Integer s1:names) { System.out.println(s1); }
		 */

		int x[][] = { { 1, 2, 3 }, { 3, 4, 5 } };

		/*
		 * for(int rows=0;rows<x.length;rows++) {
		 * 
		 * for(int cols=0;cols<x[rows].length;cols++) {
		 * System.out.print(x[rows][cols]+" "); } System.out.println(); }
		 */

		// for each

		for (int rows[] : x) {
			for (int col : rows) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		/*
		 * long i=2147483648L;
		 * 
		 * double f=876.45;
		 */

		// System.out.println("I= " + i);

		// s.fun(76.45f);

	}

}
