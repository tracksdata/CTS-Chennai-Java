package com;

public class Samplec<E1,E2> {
	
	
	@SuppressWarnings("unchecked")
	void swap(E1 e1,E2 e2) {
		
		Object obj=e1;
		e1=(E1) e2;
		e2=(E2) obj;
		
		System.out.println(e1+"  "+e2);
		
		
	}
	
/*	
	void fun(int x) {
		System.out.println("X int: "+x);
	}
	
	void fun(String x) {
		System.out.println("X string: "+x);
	}*/
	
	

	public static void main(String[] args) {
		
		/*Samplec<Object> s=new Samplec<>();
		s.fun("Abc");
		s.fun(100);
		s.fun(65.56f);*/
		
		Samplec<Object, Object> s=new Samplec<>();
		s.swap("Abc", 100);
		
		
		
		
		
		
		
		

	}

}
