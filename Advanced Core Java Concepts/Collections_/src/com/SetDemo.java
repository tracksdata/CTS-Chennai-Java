package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<Object> s = new TreeSet<>();

		s.add("Xyz");
		s.add("Abc");
		s.add("EMp");
		s.add("84934");
		s.add("FDF");
		s.add("Xyz");// duplicate

		Iterator<Object> it = s.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("Abc")) {
				it.remove();

				continue;
			}
		}
		s.add("Test");
		System.out.println("data: " + s);

		//

	}
}
