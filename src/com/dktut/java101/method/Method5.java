package com.dktut.java101.method;

public class Method5 {

	public static void main(String args[]) {
		sum(1,2);
	}
	
	public static int sum(int a, int b) {
		return multiply(a,b);
	}
	
	public static int multiply(int a, int b) {
		return sum(a,b);
	}
	
	
}
