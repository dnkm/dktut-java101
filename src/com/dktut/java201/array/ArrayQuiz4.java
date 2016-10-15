package com.dktut.java201.array;

public class ArrayQuiz4 {
	public static void main(String args[]) {
		String a = "United";
		marquee(a, 3, 2);
	}

	private static void marquee(String str, int subStrLen, int repeat) {
		for (int r = 0; r < repeat; r++) {
			for (int i = 0; i <= str.length() - subStrLen ; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.println(str.substring(i, i + subStrLen));
			}
			for (int i = str.length() - 1 - subStrLen; i >= 1; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.println(str.substring(i, i + subStrLen));
			}
		}
		
		System.out.println(str.substring(0, subStrLen));
	}

}
