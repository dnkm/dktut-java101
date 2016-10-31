package com.dktut.java201.clashfx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FxTest2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage theStage) throws Exception {
		theStage.setTitle( "Timeline Example" );
		 
	    Group root = new Group();
	    Scene theScene = new Scene( root );
	    theStage.setScene( theScene );
	 
	    Canvas canvas = new Canvas( 512, 512 );
	    root.getChildren().add( canvas );
	 
	    GraphicsContext gc = canvas.getGraphicsContext2D();
	 
	    Image earth = new Image( "http://irvinecode.com/images/java-201/earth.png" );
	    Image sun   = new Image( "http://irvinecode.com/images/java-201/sun.png" );
	 
	    final long startNanoTime = System.nanoTime();
	 
	    // annonymous inner class
	    new AnimationTimer()
	    {
	    	int x = 0;
	    	int y = 0;
	    	
	        public void handle(long currentNanoTime)
	        {
	            //gc.clearRect(0, 0, 512, 512);
	            gc.drawImage( earth, x++, y++ );
	        }
	    }.start();
	 
	    theStage.show();
	}
}
