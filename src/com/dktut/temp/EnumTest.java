package com.dktut.temp;

public class EnumTest {

	public static void main(String[] args) {
		Unit u1 = new Unit(UnitType.Knight);
		Unit u2 = new Unit(UnitType.Giant);
		Unit u3 = new Unit(UnitType.Goblin);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
	}
}

class Unit {
	public UnitType type;
	public int hp;
	public int dmg;
	
	public Unit(UnitType type) {
		this.type = type;
		this.hp = type.getHp();
		this.dmg = type.getDmg();
	}
	
	@Override
	public String toString() {
		return this.type.toString();
	}
}

enum UnitType {
	Knight(100, 10),
	Goblin(10, 5),
	Giant(200, 0),
	Danielkim(500, 50),
	Yongari(150, 5);
	
	private final int hp, dmg;
	
	private UnitType(int hp, int dmg) {
		this.hp = hp;
		this.dmg = dmg;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getDmg() {
		return dmg;
	}
}
