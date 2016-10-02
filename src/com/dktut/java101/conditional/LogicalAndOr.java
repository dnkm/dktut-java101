package com.dktut.java101.conditional;

public class LogicalAndOr {
	public static void main(String args[]) {
		int age = 21;
		
		if (age >= 10 && age <= 19)
		{
			System.out.println("teen");
		}
		
		if (age < 10 || age > 19)
		{
			System.out.println("not teen");
		}
	}
}
