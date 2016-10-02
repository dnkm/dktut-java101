package com.dktut.java101.method;

public class Method7 {

	public static void main(String args[]) {
		int sum = sumBtwn(1, 5);
		System.out.println(sum);
	}
	
	public static int sumBtwn(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
}
