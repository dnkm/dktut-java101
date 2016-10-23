package com.dktut.temp;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Temp4 {
	public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Queue<Integer> cQueue = new ConcurrentLinkedQueue<>();
		
        test(linkedList);
	}
	
	private static void test(List<Integer> col) {
		col.add(10);
		col.add(20);
		col.add(10);
		col.add(5);
		
		for(Integer i : col) {
			System.out.print(i + ",");
		}System.out.println();
		
		// remove
		Integer toDelete = col.get(2);
		col.remove(toDelete);
		

        for(Integer i : col) {
            System.out.print(i + " , ");
        }
        System.out.println();
	}
}
