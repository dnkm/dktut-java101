package com.dktut.java101.project.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		String input = "";
		int strike = 0;
		int ball = 0;

		int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] answer = new int[3];
		int[] guess = new int[3];
		
		Scanner scan = new Scanner(System.in);

		// shuffle
		for(int i=0; i<100; i++) {
			int a = (int) (Math.random() * number.length);
			int b = (int) (Math.random() * number.length);
			
			int temp = number[a];
			number[a] = number[b];
			number[b] = temp;
		}
		
		answer[0] = number[0];
		answer[1] = number[1];
		answer[2] = number[2];
		
		System.out.println(Arrays.toString(answer));
		
		while ( true ) {
			strike = ball = 0;
			System.out.print("Guess : ");
			input = scan.next();
			
			for (int i=0; i<3; i++) {
				char c = input.charAt(i);
				//guess[i] = Character.getNumericValue(c);
				guess[i] = c - '0';
			}
			
			System.out.println(Arrays.toString(guess));
			
			for(int i=0; i<guess.length; i++) {
				for(int j=0; j<answer.length; j++) {
					if (answer[j] == guess[i]) {
						if (i==j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			
			if (strike == 3) {
				System.out.println("CORRECT");
				break;
			}
			
			System.out.println("S: " + strike);
			System.out.println("B: " + ball);
		}
	}

}
