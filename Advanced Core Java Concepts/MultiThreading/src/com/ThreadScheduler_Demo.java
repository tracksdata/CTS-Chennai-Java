package com;

class ClassRoom implements Runnable {

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		String name = thread.getName();

		for (int i = 1; i <= 500; i++) {
			System.out.println(name + "\t" + i);
		}

		System.out.println(name + ": Finished");
	}

}

public class ThreadScheduler_Demo {

	public static void main(String[] args) {

		System.out.println("Main Start");

		ClassRoom cr = new ClassRoom();

		Thread thread1 = new Thread(cr, "Jino");
		Thread thread2 = new Thread(cr, "Pavithra");
		Thread thread3 = new Thread(cr, "Aasha");
		Thread thread4 = new Thread(cr, "Archana");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		System.out.println("Main with other work...");

	}

}
