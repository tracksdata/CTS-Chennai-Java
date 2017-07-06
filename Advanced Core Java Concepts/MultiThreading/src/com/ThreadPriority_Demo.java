package com;

/*
 *  Thread Priority Ranage:
 *  
 *  1           5        10
 *  
 *  Min       Normal     Max
 * 
 * 
 */

class Cafeteria implements Runnable {

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		String name = thread.getName();

		System.out.println(name + " : In Cefeteria , Pri:"
				+ thread.getPriority());

	}
}

public class ThreadPriority_Demo {

	public static void main(String[] args) {

		Cafeteria cr = new Cafeteria();

		Thread thread1 = new Thread(cr, "Jino");
		thread1.setPriority(Thread.MIN_PRIORITY);
		Thread thread2 = new Thread(cr, "Pavithra");
		thread2.setPriority(Thread.MAX_PRIORITY);
		Thread thread3 = new Thread(cr, "Aasha");
		Thread thread4 = new Thread(cr, "Archana");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// System.out.println("Main:"+Thread.currentThread().getPriority());

	}

}
