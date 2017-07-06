package com;

public class StringBufferDemo {
	/*
	@Override
	public boolean equals(Object sb1) {		
		
		
	}
	*/
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		StringBuffer sb1=new StringBuffer("Abc");
		System.out.println("SQRT of 100 is "+Math.sqrt(100));
		
		System.out.println("Hashcode of sb: "+sb.hashCode());
		System.out.println("Hashcode of sb1: "+sb1.hashCode());
		//sb.reverse();
		System.out.println("Sb: "+sb);
		System.out.println("Sb1: "+sb1);

		
		if((sb).toString().equals(sb1.toString())) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
		//String s1=new String("A");
		
		/*System.out.println(sb);
		System.out.println("hashcode of sb: "+sb.hashCode());
		sb.append("Xyz");
		System.out.println(sb);
		//System.out.println("hashcode of s1: "+s1.hashCode());
		System.out.println("hashcode of sb: "+sb.hashCode());*/
		
		
		
		
		
	}

}
