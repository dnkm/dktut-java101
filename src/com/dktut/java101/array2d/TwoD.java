package com.dktut.java101.array2d;

public class TwoD {
	public static void main(String rags[]) {
		int[][] aa = createXY(5, 10);
		
		print(aa);
	}

	public static int[][] createXY(int width, int height) {
		int[][] ar = new int[width][height];

		for (int i = 0; i < width; i++) {
			for(int j=0; j<height; j++) {
				ar[i][j] = 10; 
			}
		}
		
		return ar;
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for(int j=0; j<ar[0].length; j++) {
				System.out.print(ar[i][j] + " , ");
			}
			System.out.println();
		}
			
	}
}
