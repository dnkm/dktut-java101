package com.dktut.java201.array;

public class ArrayUtils {

	public static void printArray(int[] arr) {
		System.out.print("[ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
