package com.dktut.java101.conditional;

public class If1 {

	public static void main(String args[]) {
		int score = 70;
		
		if ( score >= 90 )
		{
			System.out.println("PASS + Extra Credit");
		}
		else if ( score >= 50)
		{
			System.out.println("PASS");
		}
		else if ( score >= 48)
		{
			System.out.println("PASS Considered");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
	}
	
	
}
