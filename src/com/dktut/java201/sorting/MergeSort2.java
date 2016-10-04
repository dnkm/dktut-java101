package com.dktut.java201.sorting;

import com.dktut.java101.array.ArrayUtils;

public class MergeSort2 {
	public static void main(String[] args) {
		int[] arr = {3,1,5,2,10,7,5};
		arr = mergeSort(arr);
		ArrayUtils.printArray(arr);
		
	}

	static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		
		// divide
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length - left.length];
		
		copy(arr, left, 0);
		copy(arr, right, left.length);
		
		// sort
		left = mergeSort(left);
		right = mergeSort(right);
		
		System.out.println("-----------");
		ArrayUtils.printArray(left);
		ArrayUtils.printArray(right);
		
		// merge
		return merge(left, right);
	}
	
	static int[] merge(int[] a, int[] b) {
		int[] ret = new int[a.length + b.length];
		int aa = 0;
		int bb = 0;
		int cc = 0;
		while(aa < a.length && bb < b.length) {
			if (a[aa] < b[bb]) {
				ret[cc++] = a[aa++];
			} else {
				ret[cc++] = b[bb++];
			}
		}
		
		while(aa < a.length) {
			ret[cc++] = a[aa++];
		}
		while(bb < b.length) {
			ret[cc++] = b[bb++];
		}
		
		return ret;
	}
	
	static void copy(int[] src, int[] dest, int offset) {
		for(int i=0; i<dest.length; i++) {
			dest[i] = src[i+offset];
		}
	}
}
