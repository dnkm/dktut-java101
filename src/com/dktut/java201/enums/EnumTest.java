package com.dktut.java201.enums;

public class EnumTest {

	public static void main(String[] args) {
		Color color = Color.BLUE;

		switch (color) {
		case GREEN:
			System.out.println("Green selected");
			break;
		case RED:
			System.out.println("Red selected");
			break;

		default:
			System.out.println("Neither green nor red");
			break;
		}
	}

}

enum Color {
	RED, BLUE, GREEN, YELLOW
}