package com;

class R1 {

	public synchronized void R1_method1(R2 r2) {

		System.out.println("T1 having R1");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("T1 Trying to get R2");
		r2.R2_method2();

	}

	public void R1_method2() {
		System.out.println("T2 having R1 also");
	}

}

class R2 {

	public synchronized void R2_method1(R1 r1) {

		System.out.println("T2 having R2");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("T2 Trying to get R1");
		r1.R1_method2();
	}

	public void R2_method2() {
		System.out.println("T1 having R2 also");
	}

}

class M_TW implements Runnable {

	R1 r1;
	R2 r2;

	public M_TW(R1 r1, R2 r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		String name = thread.getName();

		if (name.equals("T1")) {
			r1.R1_method1(r2);
		}

		if (name.equals("T2")) {
			r2.R2_method1(r1);
		}

	}

}

public class DeadLock_Demo {

	public static void main(String[] args) {

		R1 r1 = new R1();
		R2 r2 = new R2();

		M_TW tw = new M_TW(r1, r2);

		Thread thread1 = new Thread(tw, "T1");
		Thread thread2 = new Thread(tw, "T2");

		thread1.start();

		thread2.start();

	}

}
