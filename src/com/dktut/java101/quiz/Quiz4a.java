package com.dktut.java101.quiz;

public class Quiz4a {
	public static void main(String[] args) {
		int[] scores = new int[20];

		// fill random
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 100) + 1;
		}

		// print all
		System.out.print("[");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]);
			if (i<scores.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
		// find max
		int max = scores[0];
		int min = scores[0];
		
		for(int i=0; i<scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min: " + min);
		
	}
}
