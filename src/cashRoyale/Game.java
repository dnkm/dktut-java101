package cashRoyale;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Game extends Application {

	public Player[] players;
	public Group root;
	public Scene scene;
	public Rectangle[] elixir = new Rectangle[Constants.ELIXIR_CNT];
	public int elixirCnt = 0;
	
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
		scene = new Scene(root, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
		stage.setScene(scene);

		setupLayout();

		players[0].createTowers(root);
		players[1].createTowers(root);
		
		final long startTime = System.nanoTime();
		Game that = this;

		new AnimationTimer() {

			int prevSec = 0;
			
			@Override
			public void handle(long now) {
				int seconds = (int)((now - startTime) / 1000000000);
				if (seconds > prevSec) {
					prevSec++;
					if (that.elixirCnt < Constants.ELIXIR_CNT) {
						that.elixir[that.elixirCnt++].setFill(Color.HOTPINK);
					}
				}
			}
		}.start();

		stage.show();
	}

	public void setupLayout() {
		this.scene.setFill(Color.BEIGE);

		Rectangle r1 = new Rectangle(0, 0, Constants.GAME_WIDTH, Constants.Y2);
		r1.setFill(Color.ANTIQUEWHITE);
		root.getChildren().add(r1);

		Rectangle r2 = new Rectangle(0, Constants.Y3, Constants.GAME_WIDTH, Constants.Y4);
		r2.setFill(Color.DIMGRAY);
		root.getChildren().add(r2);

		for (int i = 0; i < Constants.ELIXIR_CNT; i++) {
			Rectangle r = 
					new Rectangle( Constants.GAME_WIDTH/Constants.ELIXIR_CNT*i , Constants.Y4, 
							Constants.GAME_WIDTH/Constants.ELIXIR_CNT*(i+1), Constants.Y5);
			r.setFill(Color.WHITE);
			r.setStroke(Color.BLACK);
			root.getChildren().add(r);
			this.elixir[i] = r;
		}
	}

}
