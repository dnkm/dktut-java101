package com.dktut.java201.clash.units;

import com.dktut.java201.clash.Player;

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
	}
}
