package com.dktut.temp;

public class SortedArray {
	
	private int[] array;
	
	public void add(int n) {
		if (array == null) {
			array = new int[1];
			array[0] = n;
			return;
		}
		
		// clone
		int[] array2 = new int[array.length + 1];
		
		for(int i=0; i<array.length; i++) {
			array2[i] = array[i];
		}
		
		// insert n
		for(int i=array2.length-1; i>=0; i--) {
			if (i==0) {
				array2[0] = n; break;
			}
			
			if(n > array2[i-1]) {
				array2[i-1] = n;
				break;
			}
			array2[i] = array2[i-1];
		}
		
		
		
		this.array = array2;
		
		// print
		print();
	}
	
	public void print() {
		for(int i : array) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SortedArray ar = new SortedArray();
		ar.add(10);
		ar.add(5);
		ar.add(2);
		ar.add(7);
	}
}
