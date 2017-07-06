package com;


/*
 * 
 *    main: -------------thread1.start()----------------
 *    
 * 							thread1:-----------------thread2.start()--------
 * 
 * 														thread2:------------------		
 */

class P implements Runnable {

	@Override
	public void run() {
		System.out.println("I am User Thread");
	}
}

public class CommonMistake {

	public static void main(String[] args) {

		System.out.println("A");

		P p = new P();
		Thread thread = new Thread(p);
		// thread.run(); // Same Thread will do Run Behav
		thread.start(); // Will create new thread oprn with separate Stack

		System.out.println("B");

	}

}
