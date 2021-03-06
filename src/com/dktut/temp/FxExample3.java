package com.dktut.temp;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FxExample3 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Hello Fx");
		
		Group root = new Group();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		final Canvas canvas = new Canvas(1000, 800);
		root.getChildren().add(canvas);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		Image earth = new Image( "http://irvinecode.com/images/java-201/earth.png" );
		Image sun   = new Image( "http://irvinecode.com/images/java-201/sun.png" );
		
		//////////////////-------------------------------------------
		
		
		
		new AnimationTimer() {
			
			
			@Override
			public void handle(long arg0) {
				gc.clearRect(0, 0, 1000, 800);

				
				gc.drawImage(sun, 100, 100);
				gc.drawImage(earth, 100, 50);
			}
			
		}.start();
		
		
		
		
		
		//////////////////-------------------------------------------
		
		stage.show();
	}
}













