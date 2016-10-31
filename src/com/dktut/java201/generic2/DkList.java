package com.dktut.java201.generic2;

import java.util.Iterator;

public class DkList implements Iterable<Integer> {
	
	Node first, last;
	int size;
	
	public DkList() {
		size = 0;
		first = last = new Node(0);
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		last.next = newNode;
		last = newNode;
		size++;
	}
	
	public void printAll() {
		Node n = first;
		
		while(n.next != null) {
			n = n.next;
			System.out.println(n.value);
		}
	}
	
	public int get(int index) {
		Node n = first.next;
		for(int i=0; i<index; i++) {
			n = n.next;
		}
		return n.value;
	}
	
	public static void main(String[] args) {
		DkList list = new DkList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i : list) {
			System.out.println(i);
		}
		
		Iterator<Integer> iterator = list.iterator();
		while( iterator.hasNext() ) {
			System.out.println( iterator.next() );
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new DkListIterator(first);
	}
}

class DkListIterator implements Iterator<Integer> {

	Node node;
	
	public DkListIterator(Node node) {
		this.node = node;
	}
	
	@Override
	public boolean hasNext() {
		return (node.next != null);
	}

	@Override
	public Integer next() {
		node = node.next;
		return node.value;
	}
	
}

class Node {
	int value;
	Node next;
	
	public Node(int value) { this.value = value; }
}