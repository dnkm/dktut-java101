package com.dktut.java201.quiz;

public class GameOfLife {
	
	boolean[][] board;
	
	public GameOfLife(int i, int j) {
		board = new boolean[i][j];
	}
	
	public void fill(int x, int y) {
		board[x][y] = true;
	}
	
	public void print() {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if (board[j][i]) {
					System.out.print("[x]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
		System.out.println("----------------");
	}
	
	public void next() {
		int[][] counter = new int[board.length][board[0].length];
		
		// TODO fill counter array

		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if (counter[i][j] == 3) {
					board[i][j] = true;
				} else if (counter[i][j] == 2 && board[i][j]) {
					board[i][j] = true;
				} else {
					board[i][j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		GameOfLife game = new GameOfLife(5, 5);
		
		game.fill(2,1);
		game.fill(2,2);
		game.fill(2,3);
		
		game.print();
		
		game.next();
		game.print();
	}
	
	
	
	
}
