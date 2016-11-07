package com.dktut.java201.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz3 {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		for(int i=0; i<10000; i++) {
			if (i==800) {
				myList.add(800);				
			} else {
				myList.add(i+1);
			}
		}
		
		Collections.shuffle(myList);
		
		for(int i : myList) {
			System.out.print(i + ", ");
		}
		
		printDuplicate(myList);
	}

	private static void printDuplicate(List<Integer> list) {
		// TODO Auto-generated method stub
		
	}


}
