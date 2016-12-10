package cashRoyale;

import cashRoyale.unit.impl.Tower;
import cashRoyale.unit.impl.Unit;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {
	
	public Player[] players;
	public Group root;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		players = new Player[2];
		players[0] = new Player("Player", Color.DEEPSKYBLUE, 350);
		players[1] = new Player("Bot", Color.DEEPPINK, 30);
		
		stage.setTitle("Cash Royale");
		root = new Group();
		Scene scene = 
				new Scene(root, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
		stage.setScene(scene);

		players[0].createTowers(root);
		players[1].createTowers(root);
		
		new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				//u1.move();
				//u2.move();
			}
		}.start();
		
		stage.show();
	}
	
	public void doSomething() {
		
	}

}
