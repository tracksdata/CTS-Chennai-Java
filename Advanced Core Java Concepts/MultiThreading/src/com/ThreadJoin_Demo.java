package com;

class Student implements Runnable {

	@Override
	public void run() {

		System.out.println("Parcticing.......");
		System.out.println("Got Doubt");

		// Join Trainer Thread..
		Trainer trainer = new Trainer();
		Thread tr_thread = new Thread(trainer);
		tr_thread.start();

		try {
			tr_thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thank You....");

	}

}

class Trainer implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is Solution.....");
	}

}

public class ThreadJoin_Demo {

	public static void main(String[] args) {

		Student student = new Student();
		Thread thread = new Thread(student);
		thread.start();

	}

}
