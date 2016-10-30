package com.dktut.java201.clash.units;

import com.dktut.java201.clash.Player;
import com.dktut.java201.clash.Tile;

public abstract class Unit {

	double hp;
	String name;
	Player player;
	
	public Unit(String name, double hp, Player player) {
		this.name = name;
		this.hp = hp;
		this.player = player;
	}
	
	public String toString() {
		return player.getId() + "'s " + name + " (" + hp + ")"; 
	}
	
	protected void deploy(Tile tile) {
		try {
			tile.accept(this);
		} catch ( Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
