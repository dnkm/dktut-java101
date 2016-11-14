package com.dktut.java201.regex;

public class RegexTest {
	public static void main(String[] args) {
		String TEXT = "Java is fun , and interesting.";
		
		System.out.println(TEXT.matches("Java is fun and interesting."));
		System.out.println(TEXT.matches("Java.*"));
		
		String[] split = TEXT.split("\\s");
		for(String s : split) {
			System.out.println(s);
		}
		
		System.out.println( TEXT.replaceAll("\\s", "-"));
		
		String pattern = "(\\w)(\\s+)([\\.,])";
		System.out.println(TEXT.replaceAll(pattern, "$1$3"));
				
		System.out.println( "NBA ABC".replaceAll("A[^B]", "**") );
		System.out.println( "NBA ABC".replaceAll("A(?!B)", "**") );
	}
}
