package com.dktut.java101.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameOfLife2 {

	public static void main(String[] args) throws Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		Grid g = new Grid(5, 5);
		g.print();

		System.out.println();
		System.out.println();

		g.next();
		g.print();

	}
}

class Grid {
	int width;
	int height;
	boolean[] grid;

	public Grid(int w, int h) {
		width = w;
		height = h;
		grid = new boolean[w * h];
		grid[0] = true;
	}

	public void next() {
		int[] counter = new int[grid.length];

		for (int i = 0; i < counter.length; i++) {
			int total = countNeighbors(i);
			counter[i] = total;
		}

		for (int i = 0; i < grid.length; i++) {
			if (counter[i] == 3) {
				grid[i] = true;
			} else if (counter[i] == 2 && grid[i]) {
				grid[i] = true;
			} else {
				grid[i] = false;
			}
		}
	}
	
	int countNeighbors(int i) {
		int x = i % width;
		int y = i / width;
		
		int ul = (y-1) * width + (x-1);
		if (grid[ul]) {
			return 1;
		} else {
			return 0;
		}
		
	}

	public void print() {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i]) {
				System.out.print("[x]");
			} else {
				System.out.print("[ ]");
			}

			if (i % width == width - 1) {
				System.out.println();
			}
		}
	}
}
