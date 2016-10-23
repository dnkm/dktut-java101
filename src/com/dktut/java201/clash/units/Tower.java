package com.dktut.java201.clash.units;

import com.dktut.java201.clash.Player;

public class Tower implements Unit {

	public double HP;
	public Player owner;
	
	public Tower(Player p, int HP) {
		owner = p;
		this.HP = HP;
	}
	
	@Override
	public String toString() {
		return "Tower (" + owner.getId() + ") (" + HP + ")";
	}
}
