package com.dktut.java201.clashfx2;

import com.dktut.java201.clashfx2.unit.Unit;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Game extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Clash Royale Fx");
		
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400);
		stage.setScene(scene);
		
		final long startTime = System.nanoTime();
		
		new AnimationTimer() {
			
			int prevSec = 0;
			
			@Override
			public void handle(long now) {
				int seconds = (int)((now - startTime) / 1000000000);
				if (seconds > prevSec) {
					System.out.println(++prevSec + " has elapsed");
				}
				
				
			}
		}.start();
		
		stage.show();
	}
}
