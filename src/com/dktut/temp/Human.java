package com.dktut.temp;

import java.util.Arrays;

public class Human implements Comparable<Human> {
	private int age;
	
	public Human() {
		age = (int)(Math.random() * 60) + 1;
	}
		
	public Human(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.age + "";
	}
	
	public static void main(String[] args) {
		Human[] humans = new Human[10];
		
		for(int i=0; i<humans.length; i++) {
			humans[i] = new Human();
		}
		
		Arrays.sort(humans);
		
		for(Human h : humans) {
			System.out.print(h + " , ");
		}
		
	}

	@Override
	public int compareTo(Human o) {
		return this.age - o.age;
	}
}








