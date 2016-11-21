package com.dktut.java201.quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Quiz4b extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage theStage) throws Exception {
		theStage.setTitle( "Timeline Example" );
		 
	    Group root = new Group();
	    Scene theScene = new Scene( root, 400, 400 );
	    theStage.setScene( theScene);
	 
	    List<Circle> circles = new ArrayList<>();
	    
	    final long startNanoTime = System.nanoTime();
	 
	    new AnimationTimer()
	    {
	        public void handle(long currentNanoTime)
	        {
	            double t = (currentNanoTime - startNanoTime) / 1000000000.0;	// try *2, * 10 
	 
	            double y1 = theScene.getHeight()/2 + theScene.getHeight()/2.5d * Math.cos(t);
	            double y2 = theScene.getHeight()/2 + theScene.getHeight()/2.5d * Math.sin(t);
	            
	            Circle c1 = new Circle(theScene.getWidth()/2, y1, 10d, Color.SKYBLUE);
	            Circle c2 = new Circle(theScene.getWidth()/2, y2, 10d, Color.HOTPINK);
	            
	            circles.add(c1);
	            circles.add(c2);
	            
	            root.getChildren().add(c1);
	            root.getChildren().add(c2);
	            
	            shiftCircles(root);
	            
	            System.out.println(circles.size());
	        }

			private void shiftCircles(Group root) {
				
				// do this with for(Circle c : circles)
				Iterator<Circle> it = circles.iterator();
				
				while(it.hasNext()) {
					Circle c = it.next();
					c.setCenterX(c.getCenterX() - 1);
					c.setRadius(c.getRadius()*0.95d);	// 0.99 -> 0.95
					
					if (c.getCenterX() < 0) {
						c.setCenterX(0);
						it.remove();
						root.getChildren().remove(c);
					}
				}
			}
			
	    }.start();
	 
	    theStage.show();
		
	}
	
}
