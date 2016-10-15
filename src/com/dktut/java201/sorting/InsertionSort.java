package com.dktut.java201.sorting;

import com.dktut.java201.array.ArrayUtils;

/*
 * in-place selection sort
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		insertionSort(arr);
	}
	
	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = findMinIndex(arr, i);
			ArrayUtils.swap(arr, minIndex, i);

			ArrayUtils.printArray(arr);
		}
	}

	private static int findMinIndex(int[] arr, int startingIndex) {
		int minIndex = startingIndex;
		for (int i = minIndex; i < arr.length; i++) {
			if (arr[i] < arr[minIndex])
				minIndex = i;
		}
		return minIndex;
	}

}
