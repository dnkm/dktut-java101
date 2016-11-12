package temp;

public class PersonText {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "John";
		p.greet("Daniel");
	}
}

class Person {
	String name;
	
	void greet(String name) {
		System.out.println("hi " + this.name);
	}
}