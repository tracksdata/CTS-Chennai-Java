package com;


class Test extends Thread{
	
	@Override
	public void run() {
		
		f1();
		f2();
		
	}
	void f1() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<=20;i++) {
			System.out.println("I = "+i +" By "+name);
		}
	}
	
	void f2() {
		String name=Thread.currentThread().getName();
		for(int j=0;j<=20;j++) {
			System.out.println("J = "+j +" By "+name);
		}
		
	}
	
}





public class MT {
	
	
	
	
	public static void main(String[] args) {
		
		
		Test test=new Test();
		
		Thread t1=new Thread(test,"Thread-1");
		Thread t2=new Thread(test,"Thread-2");
		
		t1.start();
		//t2.start();
		
		
		
		
	}

}
