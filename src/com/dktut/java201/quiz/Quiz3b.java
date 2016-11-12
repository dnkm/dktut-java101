package com.dktut.java201.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz3b {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(5);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(1);
		
		int[] counter = new int[100];
		
		for(int i : list) {
			counter[i]++;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.println(i + ":" + counter[i]);
		}
	}
}
