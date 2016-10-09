package com.dktut.java201.sorting;

import com.dktut.java101.array.ArrayUtils;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			shiftLeftUntilSorted(arr, i);

			ArrayUtils.printArray(arr);
		}
	}

	private static void shiftLeftUntilSorted(int[] arr, int i) {
		for (int j = i; j > 0; j--) {
			if (arr[j] > arr[j - 1])
				break;
			ArrayUtils.swap(arr, j, j - 1);
		}
	}
}
