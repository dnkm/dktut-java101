package com.dktut.java201;

public class Exercise2 {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + ",");
			}
		}
	}

	static boolean isPrime(int x) {
		if ( x == 2) {
			return true;
		}
		
		for (int i = 3; i < x; i+=2) {
			if (x % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
