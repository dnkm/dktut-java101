package com.dktut.java201.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPM {

	public static void main(String[] args) {
		String str = "United States of America";
		
		Pattern p = Pattern.compile("(\\w+)");
		Matcher m = p.matcher(str);
				
		System.out.println(m.replaceAll("$1$1"));
	}

}
