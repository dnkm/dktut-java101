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
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		Canvas canvas = new Canvas(800,600);
		root.getChildren().add(canvas);
		
		Unit u1 = new Unit(10, 10, Color.RED);
		Unit u2 = new Unit(20, 20, Color.BLUE);
		
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
