package com;

public class Sample extends Thread {

	@Override
	public void run() {
		System.out.println("--- run method");
		
		f1();
		f2();

	}

	void f1() {
		System.out.println("F1: " + Thread.currentThread().getName());
	}

	void f2() {
		System.out.println("F2: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		System.out.println("Main: " + Thread.currentThread().getName());
		Sample s = new Sample();

		Thread t = new Thread(s, "MyThread-1");

		
		
		//t.run();
		t.start();

	

	}
}
