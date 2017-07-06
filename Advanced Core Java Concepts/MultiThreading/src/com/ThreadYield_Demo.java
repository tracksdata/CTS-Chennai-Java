package com;

class CoffeMachine implements Runnable {

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		String name = thread.getName();

		for (int i = 1; i <= 10; i++) {
			System.out.println(name + ":" + i);

			if (i == 5) {
				Thread.yield();
			}

		}

	}
}

public class ThreadYield_Demo {

	public static void main(String[] args) {

		CoffeMachine cr = new CoffeMachine();

		Thread thread3 = new Thread(cr, "Aasha");
		Thread thread4 = new Thread(cr, "Archana");

		thread3.start();
		thread4.start();

	}

}
