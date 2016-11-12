package com.dktut.java201.clashfx2.unit;

import java.util.Random;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Unit implements Movable, Drawable {

	int x;
	int y;
	Color color;
	Rectangle node;
	Random rand;
	
	public Unit(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.node = new Rectangle(x,y,20,20);
		this.node.setFill(this.color);
		rand = new Random();
	}
	
	@Override
	public Node draw() {
		return node;
	}

	@Override
	public void move() {
		this.x += rand.nextInt(5) - 2;
		this.y += rand.nextInt(5) - 2;
		
		node.setX(x);
		node.setY(y);
	}

}
