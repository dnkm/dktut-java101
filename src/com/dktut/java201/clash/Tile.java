package com.dktut.java201.clash;

import com.dktut.java201.clash.units.Unit;

public class Tile {
	public Unit unit;
	
	@Override
	public String toString() {
		if (unit != null) {
			return unit.toString();
		}
		
		return "";
	}
}
