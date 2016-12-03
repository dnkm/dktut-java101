package com.dktut.temp;

public class NonPrime {

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);

		for (int i = 3, found = 3; found < 20; i++) {
			if (!isPrime(i)) {
				System.out.println(i);
				found++;
			}
		}

	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
