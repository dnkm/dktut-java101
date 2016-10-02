package com.dktut.java101.method;

public class Method3 {

	public static void main(String args[]) {
		printGreater(10,20);
		
		printGreater(-5, -10);
	}
	
	public static void printGreater(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
