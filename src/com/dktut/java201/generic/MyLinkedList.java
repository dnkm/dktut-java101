package com.dktut.java201.generic;

import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer> {
	
	public Node first;
	public Node last;
	public int size;
	
	public MyLinkedList() {
		first = last = new Node(0);
		size = 0;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);

		last.next = newNode;
		last = newNode;
		
		size++;
	}
	
	public void printAll() {
		Node node = first.next;
		
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public int get(int index) {
		Node node = first.next;
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		
		return node.data;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyLinkedListIterator(first);
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("-----------for---------------");
		for(int i=0; i<list.size; i++) {
			System.out.println( list.get(i) );
		}
		
		System.out.println("-----------print all---------------");
		list.printAll();
		
		System.out.println("-----------using the iterator---------------");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------foreach---------------");
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("-----------java8 foreach---------------");
		list.forEach(System.out::println);
				
		
		/*
		 // create a linked list
	      LinkedList ll = new LinkedList();
	      
	      // add elements to the linked list
	      ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of ll: " + ll);
	
	      // remove elements from the linked list
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Contents of ll after deletion: " + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: " + ll);
	
	      // get and set a value
	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Changed");
	      System.out.println("ll after change: " + ll);
		 */
	}
}

class MyLinkedListIterator implements Iterator<Integer> {

	private Node node;
	
	public MyLinkedListIterator(Node node) {
		this.node = node;
	}
	
	@Override
	public boolean hasNext() {
		return node.next != null;
	}

	@Override
	public Integer next() {
		node = node.next;
		return node.data;
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