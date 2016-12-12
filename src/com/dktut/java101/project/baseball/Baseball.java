package com.dktut.java101.project.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// shuffle
		int[] answer = generateAnswer();
		System.out.println(Arrays.toString(answer));
		
		for(int tries = 1; ; tries++) {
			String input = "";
			int strike = 0;
			int ball = 0;
			int[] guess = new int[3];
			
			System.out.print("\nGuess : ");
			guess[0] = scan.nextInt();
			guess[1] = scan.nextInt();
			guess[2] = scan.nextInt();
			
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
				System.out.println("CORRECT in " + tries + " tries");
				break;
			}
			
			System.out.println("S: " + strike);
			System.out.println("B: " + ball);
		}
	}

	private static int[] generateAnswer() {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		for(int i=0; i<100; i++) {
			int a = (int) (Math.random() * number.length);
			int b = (int) (Math.random() * number.length);
			
			int temp = number[a];
			number[a] = number[b];
			number[b] = temp;
		}
		
		return new int[] { number[0], number[1], number[2] };
	}

}
