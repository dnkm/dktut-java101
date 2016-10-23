package com.dktut.temp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(2);
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		
		for(Integer i : list) {
			System.out.print(i);
		}
	}
}
