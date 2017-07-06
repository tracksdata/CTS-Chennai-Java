package com;

class TW extends Thread {

	@Override
	public void run() {

		// RUNNING
		System.out.println("Thread Work.....");

		// RUNNING --> DEAD
	}

}

public class ThreadState_Demo {

	public static void main(String[] args) {

		System.out.println("Main START");

		TW tw = new TW();
		Thread thread = new Thread(tw); // NEW

		thread.start(); // NEW --> READY-TO RUN

		System.out.println("Main with Other Work..");

	}

}
