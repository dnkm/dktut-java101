package com.dktut.java101.method;

public class Euvin {
	
	public static void main(String[] args) {
		int a = subtract(1, subtract(1,2)) + 3;
		
		System.out.println(a);
	}
	
	public static int subtract(int a, int b) {
		return a+b;
	}
}
