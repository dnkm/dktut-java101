package com.dktut.java201.javafx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Earth extends Application {
	public final int WIDTH = 400;
	public final int HEIGHT = 400;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Canvas canvas = new Canvas(WIDTH, HEIGHT);
		GraphicsContext ctx = canvas.getGraphicsContext2D();
		
		Group root = new Group();
		root.getChildren().add(canvas);
		Scene scene = new Scene(root);
		
		stage.setTitle("Earth");
		stage.setScene(scene);
		
		//-----------------------------------------
	    Image earth = new Image( "http://irvinecode.com/images/java-201/earth.png" );
	    
	    new AnimationTimer() {
	    	double x = 10;
	    	double y = 10;
	    	
			@Override
			public void handle(long now) {
				ctx.clearRect(0, 0, WIDTH, HEIGHT);
				
				x = Math.min(WIDTH - earth.getWidth(), ++x);
				y = Math.min(HEIGHT - earth.getHeight(), ++y);
			
				System.out.println(x + "," + y);
				ctx.drawImage(earth, x, y);
			}
		}.start();
		
		
		
		
		
		
		
		
		
		
		
		
		stage.show();
	}
}
