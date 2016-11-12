package temp;

import java.util.Random;

public class Example {

	public static void main(String[] args) {

		Hero batman = new Hero("Batman");
		Hero superman = new Hero("Superman");
		Hero aquaman = new Hero("Aquaman");
		Hero wonderwoman = new Hero("Wonderwoman");

		Hero[] heroes = { batman, superman, aquaman };

		for (int i = 0; i < heroes.length; i++) {
			Hero hero = heroes[i];
			hero.status();
		}
		
		fight(wonderwoman, superman);
	}
	
	static void fight(Hero h1, Hero h2) {
		while(true) {
			System.out.println("-------");
			h1.hp -= h2.power;
			h2.hp -= h1.power;
			h1.status();
			h2.status();
			
			if (h1.hp <=0 || h2.hp <= 0) {
				break;
			}
		}	
	}

}

class Hero {
	String name;
	int hp;
	int power;

	// constructor
	public Hero(String name) {
		Random random = new Random();

		this.name = name;
		this.hp = random.nextInt(150) + 150;
		this.power = random.nextInt(20) + 20;

		if (name.equals("Aquaman")) {
			this.hp = 150;
			this.power = 20;
		}
	}

	void status() {
		System.out.println(name + " : " + hp);
	}
}