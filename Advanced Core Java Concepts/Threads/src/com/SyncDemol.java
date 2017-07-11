package com;

class Employee extends Thread {

	@Override
	public void run() {
		f1();
	}

	int x = 100;

	void f1() {
		
		String name = Thread.currentThread().getName();
		System.out.println("X Value "+x+" by "+name);
		//synchronized (this) {

			System.out.println("Current Thread is " + name);

			for (int i = 1; i <= 6; i++)
				System.out.println("I = " + i + " By " + name);

			x = 200;
		//} // end of sync block
		}

}

public class SyncDemol {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Thread t1 = new Thread(emp, "First");
		Thread t2 = new Thread(emp, "Second");

		
		t1.start();
		t2.start();
		
	

	}

}
