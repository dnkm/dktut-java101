package com.dktut.java201.oop.interfaces;

import java.util.Arrays;

public class Human implements Comparable<Human> {
	private int level;
	
	public Human() {
		this.level = (int)(Math.random()*1000) + 1000;
	}
	
	public Human(int salary) {
		this.level = salary;
	}
	
	public String toString() {
		return this.level + "";
	}
	
	public static void main(String[] args) {
		System.out.println(1==1);
		System.out.println("daniel".equals("daniel"));
		
		System.out.println(1 < 3);
		
		System.out.println("a".compareTo("a"));
		System.out.println("a".compareTo("b"));
		System.out.println("a".compareTo("z"));
		System.out.println("b".compareTo("a"));
		
		Human a = new Human(100);
		Human b = new Human(200);
				
		System.out.println(a.compareTo(b));
		
		Human[] humans = new Human[10];
		for(int i=0; i<humans.length; i++) {
			humans[i] = new Human();
		}
		
		printArray(humans);
		
		Arrays.sort(humans);
		
		printArray(humans);
	}
	
	public static void printArray(Human[] humans) {
		for(Human h : humans) {
			System.out.print(h.level + " , ");
		}
		System.out.println();
	}

	@Override
	public int compareTo(Human o) {
		return this.level - o.level;
	}
}

