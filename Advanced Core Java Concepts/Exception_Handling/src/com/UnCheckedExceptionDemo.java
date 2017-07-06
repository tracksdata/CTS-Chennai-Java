package com;

class UCE {

	public void a() throws RuntimeException {
		
	}
	
	public void b() {
		
		a();
	}
	

	public void work() throws ArithmeticException {

		// oprns

	}

}

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {

		UCE uce = new UCE();

		uce.work();

	}

}
