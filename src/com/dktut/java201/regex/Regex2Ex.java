package com.dktut.java201.regex;

public class Regex2Ex {

	public static void main(String[] args) {
		String str = "fwoqJordaneihfgioqeruhgiopqpippenefg";
		
		System.out.println( str.matches("(?i).*(jordan|pippen).*") );
		
	}
}
