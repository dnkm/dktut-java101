package com.dktut.temp;

public class Temp {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			printStars(i);
			printStars(i);
		}
	}

	public static void printStars(int n) {
		for(int i=0; i<n; i++) {
				System.out.print("*");		
		}
		System.out.println();
	}
}
