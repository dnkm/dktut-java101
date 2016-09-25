package com.dktut.java101.array;

public class ArrayQuiz3 {
	public static void main(String args[]) {
		String a = "United States";
		marquee(a);
	}

	private static void marquee(String a) {
		for (int i = 0; i < a.length() - 1; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			System.out.println(a.substring(i, i+2));
		}
	}

}
