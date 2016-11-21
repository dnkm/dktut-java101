package com.dktut.java101.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Conway's Game of Life

1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by over-population.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 */

public class Gameoflife {
	
	
	
	public static void main(String[] args) throws Exception {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		Game game = new Game(10,10);
		
		game.fill(5,4);
		game.fill(5,5);
		game.fill(5,6);

		while (true) {
			br.readLine();
			game.next();
			game.draw();
		}
	}
}

class Game {
	
	boolean[] board;
	int width;
	int height;
	
	public Game(int width, int height) {
		this.width = width;
		this.height = height;
		board = new boolean[width * height];
	}
	
	public void fill(int x, int y) {
		board[y * 10 + x] = true;
	}
	
	public void next() {
		for(int i=0; i<board.length; i++) {
			boolean cell = board[i];
			
			int total = 1;//getLeft(i) + getRight(i) + getTop(i) + getBottom(i);
			
			if (total == 3) {
				cell = true;
			} else if (total == 2 && cell) {
				cell = true;
			} else {
				cell = false;
			}
		}
	}
	
	
	public void draw() {
		System.out.println("\n\n\n\n\n\n\n\n");
		
		for(int i=0; i<board.length; i++) {
			if (i % width == 0) {
				System.out.println();
			}
			
			if (board[i]) {
				System.out.print("[x]");
			} else {
				System.out.print("[ ]");
			}
			
		}
	}
}
