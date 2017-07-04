package com;

public class Test {

	void fun(int x) {
		x=1000;
	}

	void fun1(int[] x) {
		x[0] = 3500;
	}

	public static void main(String[] args) {

		Test t = new Test();

		int i = 100;
		System.out.println("In Main: " + i);
		t.fun(i);
		System.out.println("In Main after fun: " + i);

		System.out.println("--------------------------------");

		int x[] = { 200 };
		System.out.println("In Main: " + x[0]);
		t.fun1(x);
		System.out.println("In Main:  Afer fun 1: " + x[0]);

	}

}
