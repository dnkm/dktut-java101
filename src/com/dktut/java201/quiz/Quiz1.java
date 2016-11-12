package com.dktut.java201.quiz;

import java.util.Random;

/*
 * Q. Create an array of size 30 with 1 missing number
 */

public class Quiz1 {
	public static void main(String[] args) {
		int[] array = generateArrayWithMissingNumber(30);
		printArray(array);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static int[] generateArrayWithMissingNumber(int size) {
		int[] array = new int[size];

		int rand = new Random().nextInt(array.length);
		System.out.println("Missing number: " + rand);
		
		for (int i = 0, j = 1; i < array.length; i++, j++) {
			if (j == rand) {
				j++;
			}
			array[i] = j;
		}
		
		return array;
	}
}
