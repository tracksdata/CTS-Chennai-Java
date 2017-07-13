package com;

import java.util.Map;
import java.util.TreeMap;

public class HashtableDemo {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> m=new TreeMap<>();
		//Collections.synchronizedMap(m);
		
		m.put(10, "Xyz");
		m.put(200, "Bba");
		//m.put(50, null);
		m.put(80, "Abc");
		//m.put(null, "Karuna");
		
		
		
		
		
		System.out.println(m);
		
		
		
		
		
	}

}
