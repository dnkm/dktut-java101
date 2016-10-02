package com.dktut.java101.array2d;

public class TwoDPlus {
	public static void main(String rags[]) {
		int[][] aa = createXY(5);
		
		print(aa);
	}

	public static int[][] createXY(int width) {
		int[][] ar = new int[width][];

		for (int i = 0; i < width; i++) {
			
			ar[i] = new int[i+1];
			
			for(int j=0; j<i+1; j++) {
				ar[i][j] = 10; 
			}
		}
		
		return ar;
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j] + " , ");
			}
			System.out.println();
		}
			
	}
}
