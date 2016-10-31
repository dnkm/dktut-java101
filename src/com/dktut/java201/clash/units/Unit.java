package com.dktut.java201.clash.units;

import com.dktut.java201.clash.Player;
<<<<<<< HEAD

public abstract class Unit {

	public String name;
	public double hp;
	public Player owner;
	
	public Unit(String name, double hp, Player owner) {
		this.hp = hp;
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return name + " (" + owner.getId() + ") (" + hp + ")";
=======
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
>>>>>>> d598014bb7d75606c756caf8a2d338b7c14133fb
	}
}
