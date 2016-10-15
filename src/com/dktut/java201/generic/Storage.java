package com.dktut.java201.generic;

public class Storage {
	public static void main(String[] args) {
		GenericStorage<Integer> is = new GenericStorage<Integer>();
		is.setData(10);
		
		GenericStorage<String> ss = new GenericStorage<String>();
		ss.setData("hello");
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
