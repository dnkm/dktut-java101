package com.dktut.java201.clash.units.impl;

import com.dktut.java201.clash.Player;
import com.dktut.java201.clash.Tile;
import com.dktut.java201.clash.units.Deployable;
import com.dktut.java201.clash.units.Unit;

public class Knight extends Unit implements Deployable {
	
	public Knight(Player player) {
		super("Knight", 600, player);
	}

	@Override
	public void deploy(Tile tile) {
		super.deploy(tile);
	}

}
