package com.dktut.java101.oop;

public class ObjectInstantiation {
	public static void main(String[] args) {
		Person p = new Person("daniel");
		System.out.println(p);

		try {
			Class cls = Class.forName("com.dktut.java101.oop.Person");
			Person p2 = (Person)cls.newInstance();
			System.out.println(p2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		Person p3;
		try {
			p3 = p.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Person p4 = Person.create("johnny");
		System.out.println(p4);
	}

}

class Person implements Cloneable {
	String name;

	public Person() {
		this.name = "John Doe";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public static Person create(String name) {
		Person p = new Person(name);
		return p;
	}

	public String toString() {
		return name;
	}
	
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}
}