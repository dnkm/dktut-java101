package com.dktut.java201.clashfx.unit.impl;

import com.dktut.java201.clashfx.unit.Unit;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tower extends Unit {
	
	int x;
	int y;
	int dx;
	int dy;
	Color color;
	Rectangle r;
	
	public Tower(int x, int y, int dx, int dy, Color color) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.color = color;
	}

	public Node draw() {
		r = new Rectangle();
		r.setX(x);
		r.setY(y);
		r.setWidth(20);
		r.setHeight(20);
		r.setArcWidth(5);
		r.setArcHeight(5);
		r.setFill(color);
		
		return r;
	}

	@Override
	public void move() {
		x = x+dx;
		y = y+dy;
		r.setX(x);
		r.setY(y);
	}

}
