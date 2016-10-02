package com.dktut.java101.forloop;

public class ContinueBreak2 {
	public static void main(String[] args) {
		
		int i = 0;
		while(i < 100)
		{	
			if ( i % 10 == 0 ) {
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("While loop ended");
		
	}
}