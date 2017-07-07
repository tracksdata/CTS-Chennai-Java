package com;

import java.io.IOException;

class C1 {

	public int f1(int x) {

		return 0;
	}
}

class C2 extends C1 {
	
	
	
	protected int f1(int x,int y) {
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}

}

public class Use {

	public void fun() throws RuntimeException {
		System.out.println("using this method is fun...");
	}

	void fun1() {
		int f = 76;
		try {

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println(f);
		}

	}

}
