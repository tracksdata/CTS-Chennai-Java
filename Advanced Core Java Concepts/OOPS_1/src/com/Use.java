package com;

import java.io.PrintStream;

public class Use {

	public static void main(String[] args) {

		/*
		 * Test t=new Test(); t.fun();
		 */

		Sample.getObject().fun();
		Sample.getObject().fun();
		Sample.getObject().fun();

		PrintStream ps = System.out;
		
		System.out.println("---- ps hashcode: " + ps.hashCode());
		ps.println("t1");
		ps.println("t2");
		ps.println("t3");

	}
}
