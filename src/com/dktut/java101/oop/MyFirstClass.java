package com.dktut.java101.oop;

public class MyFirstClass {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "John";
		p.age = 10;
		
		System.out.println(p.name);
		System.out.println(p.age);
	}
}

class Person {
	String name;
	int age;
}
