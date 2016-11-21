package com.dktut.java201.quiz;

// http://planetcalc.com/3757/
public class Quiz5b {

	public static void main(String[] args) {
		GenericCombinationGenerator.printCombinations(new Object[] { 1, 2, 3, 4, 5 }, 3);
		GenericCombinationGenerator.printCombinations(new Object[] { 1, 2, 3, 4 }, 3);
		GenericCombinationGenerator.printCombinations(new Object[] { "apple", "banana", "orange" }, 2);
	}

}

class GenericCombinationGenerator {

	public static void printCombinations(Object[] arr, int r) {
		comb(r, arr, 0, new Object[r], 0);
		System.out.println("finished------------------------");
	}

	public static void comb(int r, Object[] arr, int ai, Object[] current, int ci) {
		if (ci == r) {
			printArray(current);
			return;
		}

		for (int i = ai; i < arr.length; i++) {
			current[ci] = arr[i];
			comb(r, arr, i + 1, current, ci + 1);
		}
	}

	private static void printArray(Object[] arr) {
		for (Object i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}