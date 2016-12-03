package com.dktut.java201.quiz;

// http://planetcalc.com/3757/
public class Quiz5 {

	public static void main(String[] args) {
		CombinationGenerator.printCombinations(new int[] { 1, 2, 3, 4 }, 2);
		CombinationGenerator.printCombinations(new int[] { 1, 2, 3, 4 }, 3);
	}

}












class CombinationGenerator {

	public static void printCombinations(int[] arr, int r) {
		comb(r, arr, 0, new int[r], 0);
		System.out.println("finished------------------------");
	}

	public static void comb(int r, int[] arr, int ai, int[] current, int ci) {
		if (ci == r) {
			printArray(current);
			return;
		}

		for (int i = ai; i < arr.length; i++) {
			current[ci] = arr[i];
			comb(r, arr, i + 1, current, ci + 1);
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}