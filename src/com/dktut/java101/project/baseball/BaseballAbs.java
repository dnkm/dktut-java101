package com.dktut.java101.project.baseball;

import java.util.Arrays;

public class BaseballAbs {
	public static void main(String[] args) {
		int[] answer = generateAnswer();
		
		System.out.println("answer:" + Arrays.toString(answer));
		
		calculate(new int[]{1,2,3}, new int[]{3,2,9});
	}
	
	private static int[] generateAnswer() {
		int[] number = new int[9];
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		
		// shuffle
		for(int i=0; i<100; i++) {
			int a = (int)(Math.random() * number.length);
			int b = (int)(Math.random() * number.length);
			int temp = number[a];
			number[a] = number[b];
			number[b] = temp;
		}
		
		return new int[] { number[0], number[1], number[2] };
		
	}
	
	private static void calculate(int[] answer, int[] guess) {
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<guess.length; j++) {
				if (answer[i] == guess[j]) {
					if (i==j) { strike++; }
					else { ball++; }
				}
			}
		}
		
		System.out.println("S: " + strike);
		System.out.println("B: " + ball);
	}
}
