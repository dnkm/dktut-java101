package com.dktut.java101.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		pyramid(10);
		pyramid(5);
	}

	static void pyramid(int height) {
		System.out.println("Pyramid of height : " + height);
		for (int i = 1; i <= height; i++) {
			printStars(i);
		}
	}
	
	static void printStars(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
