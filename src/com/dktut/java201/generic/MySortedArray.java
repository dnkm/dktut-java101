package com.dktut.java201.generic;

import com.dktut.java101.array.ArrayUtils;

public class MySortedArray {

	private int[] array;
	
	public MySortedArray() {
	}
	
	public void add(int a) {
		
		if (array == null) {
			array = new int[]{ a };
			ArrayUtils.printArray(array);
			return;
		}
		
		int[] newArray = new int[array.length + 1];
		
		// clone
		for(int i=0; i<array.length; i++) {
			newArray[i] = array[i];
		}
		
		// insert
		for(int i=newArray.length-1; i>=0; i--) {
			if(i==0) {
				newArray[0] = a;
				break;
			}
			
			if (a > newArray[i-1]) {
				newArray[i] = a;
				break;
			}
			
			newArray[i] = newArray[i-1];
		}
		
		// set new array
		this.array = newArray;
		
		// print
		ArrayUtils.printArray(array);
	}
	
	public static void main(String[] args) {
		MySortedArray arr = new MySortedArray();
		
		arr.add(10);
		arr.add(2);
		arr.add(5);
		arr.add(12);
	}
}

