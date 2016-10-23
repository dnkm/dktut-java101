package com.dktut.temp;

public class Storage<T> {
	private T x;
	
	public void setX(T x) {
		this.x = x;
	}
	
	public T getX() {
		return x;
	}
	
	public static void main(String[] args) {
		Storage<String> s = new Storage<>();
		s.setX("abc");
		System.out.println(s.getX());
		
		Storage<Integer> s2 = new Storage<Integer>();
		s2.setX(1);
		System.out.println(s2.getX());
		
		Storage<Human> s3 = new Storage<Human>();
		s3.setX(new Human());
		System.out.println(s3.getX());
	}
}
