package com.dktut.java101.method;

public class Method6 {

	public static void main(String args[]) {
		int a = factorial(5);
		System.out.println(a);
	}
	
	public static int factorial(int x) {
		if (x == 1) {
			return 1;
		}
		return x * factorial(x-1);
	}
	
}
