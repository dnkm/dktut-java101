package com.dktut.java201.sorting;

import com.dktut.java201.array.ArrayUtils;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {
		for(int i=arr.length; i > 0; i--) {
			bubbleUpTo(arr, i);
			
			ArrayUtils.printArray(arr);
		}
	}

	private static void bubbleUpTo(int[] arr, int lastIndex) {
		for(int i=0; i<lastIndex-1; i++) {
			if (arr[i] > arr[i+1])
				ArrayUtils.swap(arr, i, i+1);
		}
	}
}
