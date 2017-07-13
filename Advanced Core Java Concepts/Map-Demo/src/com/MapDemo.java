package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Object> m=new HashMap<>();
		
		m.put(10, "Praveen");
		m.put(11, "James");
		m.put(12, " Bucky Wall");
		m.put(13, "Praveen");
		m.put(14, "Mark Alex");
		//m.put(null, "Clerk");
		m.put(12, "Rose");

		
		System.out.println(m);
		System.out.println(m.get("13"));
		
		
		Set<Map.Entry<Integer, Object>> objs= m.entrySet();
		System.out.println(objs);
		
		
		
		
		
		
		/* Set<Integer> keys=  m.keySet();
		 List<Integer> list=new ArrayList<>(keys);
		 
		 //System.out.println(keys);
		
		 ListIterator<Integer> it=list.listIterator();
		 System.out.println("-----------------------------------");
		 while(it.hasNext()) {
			 Integer key=it.next();
			 if(key==10) {
				 it.remove();
				// it.add(20);
				 
				 continue;
			 }
			 System.out.println(m.get(key));
		 }
		
		 System.out.println(list);
		//m.put(200, "New");
		
		 System.out.println("--------------------------------");
		 for(Integer i:list) {
			 System.out.println(m.get(i));
		 }*/
		
		
	}
	
}
