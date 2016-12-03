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

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Cash Royale");
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400);
		stage.setScene(scene);

		Tower t1 = new Tower(10, 10, Color.AQUA);
		Tower t2 = new Tower(10, 340, Color.HOTPINK);
		
		root.getChildren().add(t1.draw());
		root.getChildren().add(t2.draw());
		
		Unit u1 = new Unit(50,50,1,10,t2);
		Unit u2 = new Unit(200,200,1,10,t1);
		
		root.getChildren().add(u1.draw());
		root.getChildren().add(u2.draw());
		
		new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				u1.move();
				u2.move();
			}
		}.start();
		
		stage.show();
	}

}
