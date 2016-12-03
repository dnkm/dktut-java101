package cashRoyale.unit.impl;

import cashRoyale.unit.Drawable;
import cashRoyale.unit.Moveable;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Unit implements Drawable, Moveable {

	public double x, y;
	public double speed;
	public double radius;
	public Tower target;
	public Circle c;
	
	public Unit(double x, double y, double speed, double radius, Tower target) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.radius = radius;
		this.target = target;
	}

	@Override
	public void move() {
		this.x += (target.x > this.x) ? 1 : -1;
		this.y += (target.y > this.y) ? 1 : -1;
		c.setCenterX(this.x);
		c.setCenterY(this.y);
	}

	@Override
	public Node draw() {
		c = new Circle(x, y, radius, Color.RED);
		return c;
	}

}
