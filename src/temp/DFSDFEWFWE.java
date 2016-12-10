package temp;

public class DFSDFEWFWE {
	public static void main(String[] args) {
		Human adam = new Human("adam", 10);
		Human hulk = new Human("hulk", 12);
		
		hulk.sciName = "Cat";
		
		System.out.println(Human.sciName);
		System.out.println(adam.sciName);
	}
}

class Human {
	static String sciName = "HS";
	String name;
	int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
