package com.dktut.java201.clash;

<<<<<<< HEAD
=======
import com.dktut.java201.clash.units.impl.Goblin;
import com.dktut.java201.clash.units.impl.Knight;
>>>>>>> d598014bb7d75606c756caf8a2d338b7c14133fb
import com.dktut.java201.clash.units.impl.Tower;

public class Game {
	public static final int MAP_LENGTH = 10; 
	public static final int NUM_PLAYERS = 2;
	public static final int TOWER_INIT_HP = 100;
	
	Tile[] row;
	Player[] players;
	
	public static void main(String[] args) {
		Game g = new Game();
	}
	
	public Game() {
		// init
		row = new Tile[MAP_LENGTH];
		for(int i=0; i<MAP_LENGTH; i++) {
			row[i] = new Tile();
		}
		
		players = new Player[NUM_PLAYERS];
		for(int i=0; i<NUM_PLAYERS; i++) {
			players[i] = new DkBot(i);
		}
		
		setupTower(players[0], 0);
		setupTower(players[1], MAP_LENGTH-1);
		
		// test deploy
		Knight u1 = new Knight(players[0]);
		u1.deploy(row[1]);
		
		Goblin u2 = new Goblin(players[1]);
		u2.deploy(row[1]);
		
		display();
	}
	
	private void setupTower(Player p, int index) {
		Tower t = new Tower(TOWER_INIT_HP, p);
		row[index].unit = t;
	}
	
	private void display() {
		for(Tile t : row) {
			System.out.println("[ " + t + " ]");
		}
	}
}
