package com.dktut.java201.clash.units.impl;

import com.dktut.java201.clash.Player;
import com.dktut.java201.clash.Tile;
import com.dktut.java201.clash.units.Deployable;
import com.dktut.java201.clash.units.Unit;

public class Goblin extends Unit implements Deployable {
	
	public Goblin(Player player) {
		super("Goblin", 100, player);
	}

	@Override
	public void deploy(Tile tile) {
		super.deploy(tile);
	}

}
