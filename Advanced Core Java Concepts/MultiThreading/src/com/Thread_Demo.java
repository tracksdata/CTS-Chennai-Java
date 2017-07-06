package com;

/*
 *  How to implement Thread Work in Java?
 *  -------------------------------------
 *  
 *  2 ways:
 *  -------
 *  
 *  1. Extend 'Thread' class, and Override 'run' Method.
 *  2. Implements 'Runnable' interface ,and Override 'run' Method.
 *  
 *  
 *  which is best?
 *  
 *  	:- using Runnable
 *  
 *  --> Overcome M.I limitation
 *  --> T.W class loose-coupled from thread class.
 *  --> will force to define 'run' method.
 * 
 */

class Abc {

}

class MyThreadWork extends Thread {

	@Override
	public void run() {
		System.out.println("My Thread Thread Work....");
	}

}

class A extends Thread {

}

class B implements Runnable {
	@Override
	public void run() {

	}
}

public class Thread_Demo {

	public static void main(String[] args) {

		System.out.println("Main Thread Start");

		MyThreadWork tw = new MyThreadWork();
		Thread thread = new Thread(tw);
		thread.start();

		// Different ways to create Thread Object:

		Thread thread2 = new Thread(new A());
		Thread thread3 = new Thread(new B());

		Thread thread4 = new Thread(new A(), "pavithra");

		Thread thread5 = new Thread(new A());
		thread5.setName("abc");

		A a = new A(); // Valid Thread
		a.start();

		B b = new B();
		// b.start(); // Invalid

		System.out.println("Main With Other work..");

	}
}
