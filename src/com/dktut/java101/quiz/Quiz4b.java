package com.dktut.java101.quiz;

public class Quiz4b {
	public static void main(String[] args) {
		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// print normal and backward
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "," + arr[arr.length-1-i]);
		}

	}
}
