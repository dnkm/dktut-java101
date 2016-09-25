package com.dktut.java101.array;

public class ArrayQuiz1 {
	public static void main(String args[]) {
		String a = "123456789";
		String b = "abcde";

		String c = altMerge(a, b);
		System.out.println(c);
	}

	public static String altMerge(String a, String b) {
		StringBuffer sb = new StringBuffer();

		int aa = 0;
		int bb = 0;

		while (aa < a.length() || bb < b.length()) {
			if (aa < a.length()) {
				sb.append(a.charAt(aa++));
			}
			if (bb < b.length()) {
				sb.append(b.charAt(bb++));
			}
		}

		return sb.toString();
	}
}
