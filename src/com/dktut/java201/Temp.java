package com.dktut.java201;

public class Temp {
	public static void main(String args[]) {
		String a = "12345";
		String b = "abcde";

		String c = altMerge(a, b);
		System.out.println(c);
	}

	public static String altMerge(String a, String b) {
		StringBuffer sb = new StringBuffer();
		
		for(int aa = 0, bb = 0; aa<a.length() && bb<b.length(); aa++, bb++) {
			sb.append(a.charAt(aa));
			sb.append(b.charAt(bb));
		}
		
		return sb.toString();
	}
}
