package com.dktut.java101.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		tree(10);
		tree(5);
	}

	static void tree(int height) {
		System.out.println("Pyramid of height : " + height);
		for (int i = 1; i <= height; i++) {
			printBlanks(height-i);
			printStars(i*2);
		}
	}
	
	static void printBlanks(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(" ");
		}
	}
	
	static void printStars(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
