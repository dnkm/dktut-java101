package com.dktut.java201.quiz;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Q. Using the result from Q1, find the missing number
 */

public class Quiz2 {
	public static void main(String[] args) {
		//int[] array = generateArrayWithMissingNumber(30);
		
		int[] array = {1,5,2,8,3,4,6,7,10};
		printArray(array);
		
		printMissingNumber1(array);
		printMissingNumber2(array);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
	
	public static int[] generateArrayWithMissingNumber(int size) {
		int[] array = new int[size];

		int rand = new Random().nextInt(array.length);
		System.out.println("Missing number: " + rand);
		
		for (int i = 0, j = 1; i < array.length; i++, j++) {
			if (j == rand) {
				j++;
			}
			array[i] = j;
		}
		
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void printMissingNumber1(int[] array) {
		Set<Integer> set = new TreeSet();
		
		for(int i : array) {
			set.add(i);
		}
		
		int pre = 0;
		for(int i : set) {
			if (i != pre+1) {
				System.out.println("Missing number : " + (i-1)); return;
			}
			pre = i;
		}
	}
	
	private static void printMissingNumber2(int[] array) {
		int count = array.length + 1;
		int expectedSum = count * (count+1) / 2;
		int actualSum = 0;
		for(int i : array) {
			actualSum += i;
		}
		
		System.out.println("Missing number : " + (expectedSum - actualSum));
	}

	
}
