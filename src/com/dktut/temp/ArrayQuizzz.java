package com.dktut.temp;

public class ArrayQuizzz {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 9999, 7, 9, 100 };

		int max = arr[0];
		
		for (int i = 1; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		

	}
}
