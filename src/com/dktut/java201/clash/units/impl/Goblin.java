package com.dktut.java201.clash.units.impl;

<<<<<<< HEAD
import com.dktut.java201.clash.units.Deployable;

public class Goblin implements Deployable {

	@Override
	public void deploy() {
		// TODO Auto-generated method stub
		
=======
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
>>>>>>> d598014bb7d75606c756caf8a2d338b7c14133fb
	}

}