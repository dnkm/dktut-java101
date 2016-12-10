package cashRoyale;

import java.util.ArrayList;
import java.util.List;

import cashRoyale.unit.impl.Tower;
import cashRoyale.unit.impl.Unit;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Player {

	public int energy;
	public Color color;
	
	public Tower[] towers;
	public Unit[] deck;
	public List<Unit> deployedUnits;
	
	public double y;
	
	public String name;
	
	// constructor
	public Player(String name, Color color, double y) {
		this.name = name;
		this.color = color;
		this.y = y;
		
		this.towers = new Tower[Constants.NUM_TOWERS];
		this.deck = new Unit[Constants.DECK_SIZE];
		this.deployedUnits = new ArrayList<>();
	}
	
	public void createTowers(Group root) {
		for(int i=0; i<Constants.NUM_TOWERS; i++) {
			double x = Constants.GAME_WIDTH / (Constants.NUM_TOWERS+1) * (i+1);
			Tower t = new Tower(x, y, this);
			root.getChildren().add(t.draw());
			this.towers[i] = t;
		}
	}
}







