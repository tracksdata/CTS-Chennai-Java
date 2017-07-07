package com;

import java.util.TreeSet;

public class Exam {

	public static void main(String[] args) {
		int x1=100;
		String s1=x1+"";
		//System.out.println(s1.length());
		
		TreeSet s=new TreeSet();
		s.add("b");
		s.add("x");
		s.add(new Integer(100).toString());
		s.add("c");
		System.out.println(s);

	}

}
