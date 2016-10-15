package com.dktut.java101.array;

public class ArarysQuiz1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		// print
		for(int i=arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " , ");
		}
	}
}
