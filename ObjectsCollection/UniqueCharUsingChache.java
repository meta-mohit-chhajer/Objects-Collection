package com.metacube.ObjectsCollection;

import java.util.*;

public class UniqueCharUsingChache {

	static Map<String, Long> m1 = new HashMap<>();

	public static void main(String... arg) {

		Scanner s1 = new Scanner(System.in);
		System.out
				.println("Please enter all the String with new line or space");
		System.out.println("Enter exit to get the unique char count");

		String s = s1.next();

		while (!s.equalsIgnoreCase("exit")) {
			long count = Calc(s);
			System.out.println("Input String ->" + s + "\tCount-> " + count);
			s = s1.next();

		}
		s1.close();
	}

	/*
	 * Function to Calculate Unique Characters
	 * @Param s String 
	 */
	
	public static long Calc(String s) {
		if (s == null) {
			throw new AssertionError("Empty String");
		}
		if (m1.get(s) == null) {
			long c1 = s.chars().distinct().count();
			m1.put(s, c1);
			return c1;

		} else {
			long c1 = m1.get(s);
			return c1;
		}
	}

}
