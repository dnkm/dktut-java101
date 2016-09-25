package com.dktut.java101.array;

import java.util.Random;

public class ArrayQuiz2 {
	public static void main(String args[]) {
		int array[] = generateRandomArray(10, 5, 10);
		printArray(array);
	}

	private static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}

	public static int[] generateRandomArray(int size, int min, int max) {
		int ret[] = new int[size];
		Random rand = new Random();

		for (int i = 0; i < size; i++) {
			ret[i] = rand.nextInt(max - min + 1) + min;
		}

		return ret;
	}
}
