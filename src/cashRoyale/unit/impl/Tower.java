package cashRoyale.unit.impl;

import cashRoyale.Player;
import cashRoyale.unit.Drawable;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tower extends Unit {
	
	public static final int TOWER_WIDTH = 50;
	public static final int TOWER_HEIGHT = 50;
	
	public Tower(double x, double y, Player player) {
		super(x, y, 0, player);
	}

	@Override
	public Node draw() {
		Rectangle r = new Rectangle(x, y, TOWER_WIDTH, TOWER_HEIGHT);
		r.setFill(this.player.color);
		
		this.node = r;
		return this.node;
	}
	
	@Override
	public void move() {
		
	}
	
}
