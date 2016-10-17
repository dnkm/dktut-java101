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
		Node newNode = new Node(data);
		
		if (last == null) {
			first = last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void printAll() {
		Node node = first;
		
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.printAll();
		
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