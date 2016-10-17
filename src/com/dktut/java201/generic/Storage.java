package com.dktut.java201.generic;

public class Storage {

	public static void main(String[] args) {
		GenericStorage<Integer> is = new GenericStorage<Integer>();
		is.setData(10);

		NonGenericClass.printSorted(20, 13);
		NonGenericClass.printSorted(13, 20);

		NonGenericClass.printSorted("a", "b");
		NonGenericClass.printSorted("b", "a");

		Hero h1 = new Hero("batman", 10);
		Hero h2 = new Hero("supermanman", 11);
		NonGenericClass.printSorted(h1, h2);
	}
}

class GenericStorage<T> {
	private T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
}

class NonGenericClass {

	public static <T extends Comparable> void printSorted(T a, T b) {
		if (a.compareTo(b) < 0) {
			System.out.println(a + "," + b);
		} else {
			System.out.println(b + "," + a);
		}
	}
}

class Hero implements Comparable<Hero> {
	private String name;
	private int power;

	public Hero(String name, int power) {
		this.name = name;
		this.power = power;
	}

	@Override
	public int compareTo(Hero o) {
		return this.power - o.power;
	}

	@Override
	public String toString() {
		return this.name;
	}
}