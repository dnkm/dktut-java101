package cashRoyale.unit.impl;

import cashRoyale.Player;
import javafx.scene.Node;

public abstract class Unit {

	public double speed;
	public Node node;
	public Player player;
	
	public Unit(double speed, Player player) {
		this.speed = speed;
		this.player = player;
	}

	public abstract void move();

	public abstract Node draw(double x, double y);

}

//this.x += (target.x > this.x) ? 1 : -1;
//this.y += (target.y > this.y) ? 1 : -1;
//c.setCenterX(this.x);
//c.setCenterY(this.y);