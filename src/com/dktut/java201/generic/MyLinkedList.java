package com.dktut.java201.generic;

public class MyLinkedList {
	
	public Node first;
	public Node last;
	public int size;
	
	public MyLinkedList() {
		first = null;
		last = null;
		size = 0;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		
		if (last == null) {
			first = last = node;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		
	}

}

class Node {
	public Node prev;
	public Node next;
	
	public int data;
	
	public Node(int data) {
		this.data = data;
	}
}


// 1. create for int , all public
// 2. change int to String, then to Generics
// 3. public -> private with getter/setters