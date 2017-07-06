package com;

import java.io.IOException;

class CE {

	public void a() throws Exception {

	}

	public void b() throws Exception {
		a();
	}

	public void c() {
		
		try {
			b();
		} catch (Exception e) {
		}
	}

	public void work() throws IOException {

		// oprns

	}

}

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		CE ce = new CE();
		try {
			ce.work();
		} catch (IOException e) {
			System.out.println("Handled..");
		}

	}

}
