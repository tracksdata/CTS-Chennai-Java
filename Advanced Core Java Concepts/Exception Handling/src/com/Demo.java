package com;

public class Demo {

	void f1() {

	}

	public static void main(String[] args) {

		try {

			int x = 10;
			int y = 2;
			int z = x / y;
			Demo d = new Demo();
			d.f1();

			int i[] = { 100 };
			System.out.println("i[10] is " + i[0]);
			System.out.println("---- Division is " + z);

		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException  e) {
			System.out.println("Failed due to "+e);
		}finally {
			System.out.println("-- finally");
		}

		System.out.println("--- Line 1");
		System.out.println("--- Line 2");

	}

}
