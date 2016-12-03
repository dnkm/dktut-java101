package com.dktut.java201.quiz;

public class Quiz5q {

	public static void main(String[] args) {
		CombinationGenerator2.printCombinations(new int[] { 1, 2, 3, 4 }, 2);
		CombinationGenerator2.printCombinations(new int[] { 1, 2, 3, 4 }, 3);
	}
}

class CombinationGenerator2 {
	public static void printCombinations(int[] arr, int r) {
		
	}
	
	static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}



