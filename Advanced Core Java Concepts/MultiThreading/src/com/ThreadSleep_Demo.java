package com;

class TW5 implements Runnable {

	@Override
	public void run() {

		try {
			Thread.sleep(5000, 10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class ThreadSleep_Demo {

	public static void main(String[] args) {

		System.out.println("Eat BreakFast");

		try {
			Thread.sleep(5000, 10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Eat Lunch");

	}

}
