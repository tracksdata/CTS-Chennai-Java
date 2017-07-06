package com;

class PrintNumber {

	public void printNumber(int num) {
		System.out.println(num);
	}

}

class Odd implements Runnable {

	PrintNumber printNumber;

	public Odd(PrintNumber printNumber) {
		this.printNumber = printNumber;
	}

	@Override
	public void run() {

		int n = 1;
		
		while (true) {

			int num = 2 * n - 1;
			n++;


			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printNumber.printNumber(num);
			
			
			synchronized (printNumber) {
				printNumber.notify();
			}

			synchronized (printNumber) {
				try {
					printNumber.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}

class Even implements Runnable {

	PrintNumber printNumber;

	public Even(PrintNumber printNumber) {
		this.printNumber = printNumber;
	}

	@Override
	public void run() {

		int n = 1;
		while (true) {

			synchronized (printNumber) {
				try {
					printNumber.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			int num = 2 * n;
			n++;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// print num
			printNumber.printNumber(num);

			synchronized (printNumber) {
				printNumber.notify();
			}

		}
	}

}

public class Odd_Even {

	public static void main(String[] args) {

		PrintNumber printNumber = new PrintNumber();

		Odd odd = new Odd(printNumber);
		Even even = new Even(printNumber);

		Thread thread_odd = new Thread(odd);
		Thread thread_even = new Thread(even);

		thread_odd.start();
		thread_even.start();

	}

}
