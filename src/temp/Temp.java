package temp;

import com.dktut.java101.oop.accessModifiers.Person;

class Temp extends Person {
	
	public int sum() {
		return super.c + super.d;
	}
	
	public int sum2() {
		Person p = new Person();
		return p.d;
	}
}