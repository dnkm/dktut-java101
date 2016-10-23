package com.dktut.temp;

public class Top2<T extends Comparable> {
	
	T a, b;
	
	public Top2(T a, T b) {
		this.a = a;
		this.b = b;
	}
	
	public void add(T n) {
		if (n.compareTo(a) > 0 && n.compareTo(b) > 0) {
			if (a.compareTo(b) < 0) a = n;
			else b = n;
		} else if (n.compareTo(a) > 0) {
			a = n;
		} else if (n.compareTo(b) > 0) {
			b = n;
		}
	}
	
	public void print() {
		System.out.println(a + "," + b);
	}

	public static void main(String[] args) {
		Top2<Integer> list = new Top2<Integer>(1,2);
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(15);
		list.add(10);
		list.add(2);
		list.add(100);
		
		list.print();
	}
}
