package com;

class Lift {

	boolean work = false;

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

}

// -------------------------------

class Employee implements Runnable {

	Lift lift;

	public Employee(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void run() {

		System.out.println("Employee With LIFT");

		boolean st = lift.isWork();

		if (!st) {

			synchronized (lift) {

				try {
					System.out
							.println("Employee Waiting for LIFT Notification");
					lift.wait();
					// lift.wait(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			System.out.println("Employee Now Using Lift");

		}

	}

}

// -------------------------------

class ServiceMan implements Runnable {

	Lift lift;

	public ServiceMan(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void run() {

		System.out.println("Service With LIFT");

		synchronized (lift) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("ServiceMan Finished Work");
			lift.setWork(true);

			// lift.notify();
			lift.notifyAll();

		}

	}

}

public class Inhter_Thread_Comn {

	public static void main(String[] args) {

		Lift lift = new Lift();

		Employee emp = new Employee(lift);
		ServiceMan sman = new ServiceMan(lift);

		Thread thread_emp1 = new Thread(emp);
		Thread thread_emp2 = new Thread(emp);
		Thread thread_sman = new Thread(sman);

		thread_emp1.start();
		thread_emp2.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread_sman.start();

	}

}
