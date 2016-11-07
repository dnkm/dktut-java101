package com.dktut.java201.clashfx;

import java.util.ArrayList;
import java.util.List;

import com.dktut.java201.clashfx.unit.Unit;
import com.dktut.java201.clashfx.unit.impl.Tower;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {
	
	public static final int CANVAS_WIDTH = 600;
	public static final int CANVAS_HEIGHT = 400;
	
	Canvas canvas;
	GraphicsContext gc;
	
	List<Unit> units = new ArrayList<>();
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Crash Royale");

		Group root = new Group();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		Tower t1 = new Tower(0,0,1,1, Color.AQUA);
		Tower t2 = new Tower(100,100,-1,-1, Color.RED);
		units.add(t1);
		units.add(t2);
		root.getChildren().add(t1.draw());
		root.getChildren().add(t2.draw());
		
		new AnimationTimer() {

			@Override
			public void handle(long now) {
				t1.move();
				t2.move();
			}
			
		}.start();

		stage.show();
	}

}
