package com;
class Abc{
	String name;
	int age;
}
public class Sample {

	public static void main(String[] args) {
		
		String s1="Abc";
		Abc a=new Abc();
		a.name="Praveen";
		a.age=76;
		
		
		System.out.println("S1 hash code: "+s1.hashCode());
		System.out.println("S1 Identity Hashcode: "+System.identityHashCode(s1));
		System.out.println("S1: "+ s1);
		
		String s2=new String("Abc");
		System.out.println("S2 hash code: "+s2.hashCode());
		System.out.println("S2 Identity Hashcode: "+System.identityHashCode(s2));

		System.out.println("S2: "+ s2);
		
		if(s1.equals(s2)) {
			System.out.println("-- Equal");
		}else {
			System.out.println("Not Equal");
		}
		
	
		
		
		
		

	}

}
