package com.dktut.temp;

public class Temp2 {
	public static void main(String[] args) {
		int[] arr = { 30, 55, 123, 22, 45 };

		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			System.out.println("Current Max : " + max);
		}

		System.out.println(max);
	}
}
