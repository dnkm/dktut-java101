package com.dktut.java101.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		printStars(10);
		printStars(5);
	}

	static void printStars(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
