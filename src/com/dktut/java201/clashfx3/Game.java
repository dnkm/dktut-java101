package com.dktut.java201.clashfx3;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400);
		stage.setScene(scene);
		
		Player p1 = new Player();
		Player p2 = new BotPlayer();
		
		final long startTime = System.nanoTime();
		
		new AnimationTimer() {
			
			int prevSec = 0;
			
			@Override
			public void handle(long now) {
				int seconds = (int)((now-startTime)/1000000000);
				if (seconds > prevSec) {
					System.out.println(++prevSec + " elapsed");
					
					if (seconds % 3 == 0) {
						p1.giveElixir();
						p2.giveElixir();
					}
				}
			}
			
		}.start();
		
		stage.show();
	}
	
}
