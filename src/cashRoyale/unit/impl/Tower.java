package cashRoyale.unit.impl;

import cashRoyale.unit.Drawable;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tower implements Drawable {
	
	public static final int TOWER_WIDTH = 50;
	public static final int TOWER_HEIGHT = 50;
	
	public double x;
	public double y;
	public Color color;

	public Tower(double x, double y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	@Override
	public Node draw() {
		Rectangle rect = new Rectangle(x, y, TOWER_WIDTH, TOWER_HEIGHT);
		rect.setFill(color);
		return rect;
	}
	
}
