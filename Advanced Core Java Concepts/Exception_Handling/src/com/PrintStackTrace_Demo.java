package com;

class A {

	public void a() throws Exception {

	}
}

class B {
	public void b() throws Exception {
		new A().a();
		int a = 1 / 0;
	}
}

class C {
	public void c() throws Exception {
		new B().b();
	}
}

public class PrintStackTrace_Demo {

	public static void main(String[] args) {

		try {
			new C().c();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// -----------------------

		try {
			int a = 1 / 0;
		} catch (Exception e) {

		}

		// ----------------------

	}

}
