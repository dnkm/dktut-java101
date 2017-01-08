package com.dktut.java101.project.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballV3 {
	public static void main(String[] args) {

		int[] answer = generateAnswer();
		//System.out.println("Answer: " + Arrays.toString(answer));

		Scanner scan = new Scanner(System.in);
		int[] guess = new int[3];
		int tries = 1;
		
		while (true) {
			System.out.print("Guess : ");

			guess[0] = scan.nextInt();
			guess[1] = scan.nextInt();
			guess[2] = scan.nextInt();

			int[] sb = calculate(answer, guess);

			System.out.println("S:" + sb[0] + " B:" + sb[1]);
			
			if (sb[0] == 3) {
				System.out.println("CORRECT in " + tries + " tries");
				break;
			} else {
				tries++;
			}
		}

	}

	public static int[] calculate(int[] answer, int[] guess) {
		int s = 0;
		int b = 0;

		for (int i = 0; i < answer.length; i++) {
			for(int j=0; j<guess.length; j++) {
				if (answer[i] == guess[j]) {
					if (i==j) s++;
					else b++;
				}
			}
		}

		return new int[] { s, b };
	}

	public static int[] generateAnswer() {
		// grab numbers
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// shuffle
		for (int i = 0; i < 100; i++) {
			int a = (int) (Math.random() * numbers.length);
			int b = (int) (Math.random() * numbers.length);

			int temp = numbers[a];
			numbers[a] = numbers[b];
			numbers[b] = temp;
		}

		// take the fist 3
		int[] ret = new int[3];
		ret[0] = numbers[0];
		ret[1] = numbers[1];
		ret[2] = numbers[2];

		return ret;
	}

}
