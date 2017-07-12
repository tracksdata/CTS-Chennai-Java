package com;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Object> list = new Stack<>();
		list.add("Abc");
		list.add(1234);
		list.add(65.45f);
		list.add("Abc");
		
		System.out.println(list);

	/*	// System.out.println(list);
		// System.out.println(list.get(1));
		// list.remove(1);// primitive --> index
		// list.remove(new Integer(1234)); //--> warper --> Object
		// System.out.println(list);

		System.out.println("-------------------------------<");

		for (Object obj : list) {
			
			 * if (obj.equals("Abc")) { list.remove(obj); continue; }
			 
			System.out.println(obj);
			// list.remove(o);
		}

		System.out.println("-------------------------------");

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

		System.out.println("Iterator: --------------------------------");

		
		 * Iterations using COllection Interfaces
		 * 
		 * 1-> Iterator 2-> ListIterator 3-> Enumerator
		 

		// --> Iterator

		Iterator<Object> it = list.iterator();

		while (it.hasNext()) { //
			Object obj = it.next();

			
			 * if(obj.equals("Abc")) { it.remove(); list.add("Xyz"); continue; }
			 

			System.out.println(obj);
		}

		// --> ListIterator

		System.out.println("------------------------------------>");
		ListIterator<Object> li = list.listIterator();

		System.out.println("---- A to B ");
		while (li.hasNext()) {

			Object obj = li.next();
			if (obj.equals("Abc")) {
				li.remove();
				li.add("Xyz");
				continue;
			}

			// li.remove();
			// li.add(e);
			System.out.println(obj);
		}

		System.out.println("===================================");
		System.out.println(list);
		
		Vector v=new Vector();
		
		Enumeration<Object> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		 * System.out.println("--- B to A"); while (li.hasPrevious()) {
		 * System.out.println(li.previous()); }
		 
*/
	}

}
