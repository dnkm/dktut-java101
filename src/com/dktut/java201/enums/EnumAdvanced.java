package com.dktut.java201.enums;

public class EnumAdvanced {

	public static void main(String[] args) {
		Unit knight = Unit.KNIGHT;
		
		System.out.println(knight.hp);
		
		System.out.println(knight == Unit.KNIGHT);
	}
}

enum Unit {
    KNIGHT (100, 10, 5),
    GOBLIN (100, 10, 5),
    DRAGON (200, 10, 5),
    GIANT (100, 10, 5),
    DANIELKIM (100, 10, 5),
    YONGARI (100, 10, 5);
	
	public final double hp;
	public final int dmg;
	public final int atkSpd;
	
	private Unit(double hp, int dmg, int atkSpd) {
		this.hp = hp;
		this.dmg = dmg;
		this.atkSpd = atkSpd;
	}
}
