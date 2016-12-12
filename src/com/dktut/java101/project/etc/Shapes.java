package com.dktut.java101.project.etc;

public class Shapes {

	public static void main(String[] args) {
		diamond(9);
		sandGlass(9);
		butterfly(9);
	}

	private static void diamond(int height) {
		System.out.println("\nDiamond of height : " + height);
		if (height % 2 == 0) {
			System.out.println("Height must be an even number");
			return;
		}
		int width = height;
		for (int i = 0, blanks = (height - 1) / 2; i < height; i++) {
			for (int j = 0; j < width - (blanks); j++) {
				System.out.print((j < blanks) ? " " : "*");
			}
			blanks += (i < height / 2) ? -1 : +1;
			System.out.println();
		}
	}
	
	private static void sandGlass(int height) {
		System.out.println("\nSandGlass of height : " + height);
		if (height % 2 == 0) {
			System.out.println("Height must be an even number");
			return;
		}
		int width = height;
		for (int i = 0, blanks = 0; i < height; i++) {
			for (int j = 0; j < width - (blanks); j++) {
				System.out.print((j < blanks) ? " " : "*");
			}
			blanks += (i < height / 2) ? 1 : -1;
			System.out.println();
		}
	}
	
	private static void butterfly(int height) {
		System.out.println("\nButterfly of height : " + height);
		if (height % 2 == 0) {
			System.out.println("Height must be an even number");
			return;
		}
		int width = height;
		for (int i = 0, blanks = width-2; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print((j < (width-blanks)/2 || j > width - (width-blanks)/2 - 1) ? "*" : " ");
			}
			blanks += (i < height / 2) ? -2 : 2;
			System.out.println();
		}
	}

}
