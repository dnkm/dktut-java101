package com.dktut.java101.method;

public class Method2 {

	public static void main(String args[]) {
		printGreater(10,20);
	}
	
	static void printGreater(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
