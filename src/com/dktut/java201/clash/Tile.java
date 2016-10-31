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
	
	public void accept(Unit unit) throws Exception {
		if (this.unit == null) {
			this.unit = unit;
		} else {
			throw new Exception("Tile Occupied");
		}
	}
}
