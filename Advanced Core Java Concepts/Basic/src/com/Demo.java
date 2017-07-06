package com;

import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {

		String a = "emirates";
		String b = "emirates";

		if (a.equals(b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		// ---------------

		String name1 = "A";
		String name2 = "B";

		System.out.println(name1.compareTo(name2));

		int[] nums = { 1, 4, 2, 6, 8, 4 };
		Arrays.sort(nums);

		// Collections.sort(arg0)

	}

}
