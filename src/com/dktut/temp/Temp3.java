package com.dktut.temp;

public class Temp3 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print(i * 10 + j);
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
