package temp;

import java.util.*;

public class Tempt {
	public static void main(String[] args) {
		int[] answer = generateAnswer();
		//System.out.println(Arrays.toString(answer));

		Scanner scan = new Scanner(System.in);
		int tries = 1;
		
		while (true) {
			int[] guess = new int[3];
			guess[0] = scan.nextInt();
			guess[1] = scan.nextInt();
			guess[2] = scan.nextInt();

			boolean correct = calculate(answer, guess);
			if (correct) {
				System.out.println("You got it in " + tries + " tries");
				break;
			} else {
				tries++;
			}
		}
	}

	public static boolean calculate(int[] answer, int[] guess) {
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < guess.length; j++) {
				if (answer[i] == guess[j]) {
					if (i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}

		System.out.println("S: " + strike);
		System.out.println("B: " + ball);
		
		if (strike == 3) {
			return true;
		} else {
			return false;
		}
	}

	public static int[] generateAnswer() {
		int[] a = new int[9];

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int x = (int) (Math.random() * a.length);
			int y = (int) (Math.random() * a.length);

			int temp = a[x];
			a[x] = a[y];
			a[y] = temp;
		}

		int[] answer = new int[3];
		answer[0] = a[0];
		answer[1] = a[1];
		answer[2] = a[2];

		return answer;
	}
}
