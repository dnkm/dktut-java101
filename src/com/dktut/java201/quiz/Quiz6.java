package com.dktut.java201.quiz;

import java.util.HashMap;
import java.util.Map;

public class Quiz6 {
	public static void main(String[] args) {

		/*
		 * Reverse a string without affecting special characters
		 */

		String out1 = reverse("a,b$c");
		System.out.println("Q1: " + out1);

		/*
		 * Isomorphic strings
		 */

		boolean out2a = isIsomorphic("egg", "add");
		boolean out2b = isIsomorphic("foo", "bar");

		System.out.println("Q2: " + out2a + ", " + out2b);
	}

	private static boolean isIsomorphic(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);

			if (map.containsKey(c1) && map.get(c1) != c2) {
				return false;
			}

			map.put(a.charAt(i), b.charAt(i));
		}

		return true;
	}

	private static String reverse(String in) {

		char[] out = in.toCharArray();

		int l = 0, r = in.length() - 1;

		while (true) {
			while (!Character.isAlphabetic(in.charAt(l))) {
				l++;
			}

			while (!Character.isAlphabetic(in.charAt(r))) {
				r--;
			}

			if (l >= r) {
				break;
			}

			char temp = out[l];
			out[l] = out[r];
			out[r] = temp;

			l++;
			r--;
		}

		return new String(out);
	}
}
