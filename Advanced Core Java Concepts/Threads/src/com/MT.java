package com;

class Test extends Thread {

	int x;

	// @Override
	public void run() {

		f1();
		//f2();

	}

	void f1() {
		
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread is "+name);
		if(name.equals("Thread-2")) {
			System.out.println(name+" is Sleeping.....");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println("I= "+i+" By "+name);
		}
		
		
		/*System.out.println("F1 by "+name);
		for(int i=0;i<=1000;i++) {}
		x=100;
		
		System.out.println("X is "+x +" By "+name);
		x=200;*/
	}

	void f2() {
		String name = Thread.currentThread().getName();
		System.out.println("F2 by "+name);
	
		System.out.println("X is "+x);
		
	}

}

public class MT {

	public static void main(String[] args) {

		Test test = new Test();

		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);

		t1.setName("Thread-1");
		t2.setName("Thread-2");

	//	t2.setPriority(Thread.MAX_PRIORITY);
		//t1.setPriority(Thread.MAX_PRIORITY);

	//	System.out.println("T1 priority: " + t1.getPriority());
	//System.out.println("T1 priority: " + t2.getPriority());

		t1.start();
	    t2.start();

	}

}
