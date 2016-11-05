package com.dktut.temp;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FxExample extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Hello Fx");
		
		Group root = new Group();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		final Canvas canvas = new Canvas(600, 600);
		root.getChildren().add(canvas);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		Image earth = new Image( "http://irvinecode.com/images/java-201/earth.png" );
		Image sun   = new Image( "http://irvinecode.com/images/java-201/sun.png" );
		
		final long startNanoTime = System.nanoTime();
		
		new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				double t = (now - startNanoTime) / 1000000000.0;
				
				double x = 200 + 100 * Math.cos(t);
				double y = 200 + 100 * Math.sin(t);
				
				gc.drawImage(earth, x, y);
			}
		}.start();
		
		stage.show();
	}
}













