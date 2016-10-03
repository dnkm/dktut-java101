package com.dktut.java201.sorting;

import com.dktut.java101.array.ArrayUtils;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 6, 8, 5, 3, 7 };
		mergeSort(arr);
		ArrayUtils.printArray(arr);
	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length - left.length];
		
		arrayCopy(arr, left, 0);
		arrayCopy(arr, right, left.length);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, right);
		
		return arr;
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int ll = 0;
		int rr = 0;
		
		whie(ll < left.length && rr < right.length) {
			
		}
	}

	private static void arrayCopy(int[] src, int[] dest, int offset) {
		for(int i=0; i<dest.length; i++) {
			dest[i] = src[i+offset];
		}
		
	}
	
	
}
