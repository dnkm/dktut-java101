package com.dktut.java101.method;

public class Method1 {

	public static void main(String args[]) {
		printGrade(10);
	}
	
	static void printGrade(int score) {
		if (score < 50) {
			System.out.println("FAIL");
		} else if (score < 60) {
			System.out.println("C");
		} else if (score < 70) {
			System.out.println("B");
		} else if (score < 80) {
			System.out.println("A");
		} else {
			System.out.println("S");
		}
	}
}
