package com.dktut.java201.quiz;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Quiz4 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage theStage) throws Exception {
		theStage.setTitle( "Timeline Example" );
		 
	    Group root = new Group();
	    Scene theScene = new Scene( root, 400, 400 );
	    theStage.setScene( theScene);
	 
	    Circle c1 = new Circle(200D, 200D, 10D, Color.SKYBLUE);
	    Circle c2 = new Circle(200D, 200D, 10D, Color.HOTPINK); 
	    
	    root.getChildren().add(c1);
	    root.getChildren().add(c2);
	 	 	 
	    final long startNanoTime = System.nanoTime();
	 
	    new AnimationTimer()
	    {
	    	double t = 0;
	        public void handle(long currentNanoTime)
	        {
	            double t = (currentNanoTime - startNanoTime) / 1000000000.0;
	        	//t += Math.PI/30;	// Math.toRadians(10);
	        	
	        	
	            c1.setCenterY(200D + 100 * Math.cos(t));
	            c2.setCenterY(200D + 100 * Math.sin(t));
	 
	        }
	    }.start();
	 
	    theStage.show();
		
	}
}
