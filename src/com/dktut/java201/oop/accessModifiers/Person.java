package com.dktut.java201.oop.accessModifiers;

public class Person {
	private int a;
	int b;
	protected int c;
	public int d;

	public Person() {
		a = b = c = d = 1;
	}
	
	public int sum() {
		return a + b + c + d;
	}
}
