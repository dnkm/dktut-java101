package com.dktut.java101.forloop;

public class ForExercises {

	public static void main(String args[]) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void delimit() {
		System.out.println("--------------------");
	}
	
	public static void ex1() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
	
	public static void ex2() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			System.out.println(i*10);
		}
	} 
	
	public static void ex3() {
		for(int i=10; i<=50; i=i+5) {
			System.out.println(i);
		}
	}
	
	public static void ex4() {
		for(int i=10; i<=50; i=i+5) {
			System.out.print(i);
			if (i<20) {
				System.out.println("-boy");
			} else if (i<40) {
				System.out.println("-young man");
			} else if (i<60) {
				System.out.println("-old man");
			}
		}
	}
}
