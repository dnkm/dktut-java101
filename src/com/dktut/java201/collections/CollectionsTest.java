package com.dktut.java201.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionsTest {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		List<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		Queue<Integer> cQueue = new ConcurrentLinkedQueue<>();
		

		test("hashSet",hashSet);
		test("treeSet",treeSet);
		test("arrayList",arrayList);
		test("linkedList",linkedList);
		test("cQueue",cQueue);

		
		//queueTest(linkedList);
		//queueTest(pQueue);
	}
	
	public static void test(String name, Collection<Integer> col) {
		System.out.print(name + " : ");
		
		col.add(100);
		col.add(90);
		col.add(80);
		col.add(80);
		
		for(Integer i : col) {
			System.out.print(i + " , ");
		}
		System.out.println();
	}
	
	public static void queueTest(Queue<Integer> q) {
		q.add(100);
		q.add(90);
		q.add(80);
		q.add(80);
		
		for(Integer i : q) {
			System.out.print(i + " , ");
		}
		System.out.println();
		
		// remove
		q.remove();
		
		for(Integer i : q) {
			System.out.print(i + " , ");
		}
		System.out.println();
		
		// remove
		q.remove();
		
		for(Integer i : q) {
			System.out.print(i + " , ");
		}
		System.out.println();
	}
}
