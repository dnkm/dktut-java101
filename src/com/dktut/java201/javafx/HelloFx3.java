package com.dktut.java201.javafx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Getting Fancy
 */
public class HelloFx3 extends Application {
	
	private int WIDTH = 800;
	private int HEIGHT = 600;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage theStage) throws Exception {
		
		theStage.setTitle( "Timeline Example" );
		 
	    Group root = new Group();
	    Scene theScene = new Scene( root );
	    theStage.setScene( theScene );
	 
	    Canvas canvas = new Canvas( WIDTH, HEIGHT );
	    root.getChildren().add( canvas );
	 
	    GraphicsContext gc = canvas.getGraphicsContext2D();
	 
	    Image earth = new Image( "http://irvinecode.com/images/java-201/earth.png" );
	    Image sun   = new Image( "http://irvinecode.com/images/java-201/sun.png" );
	 
	    final long startNanoTime = System.nanoTime();
	 
	    // annonymous inner class
	    new AnimationTimer()
	    {
	    	double x = 0;
	    	double y = 0;
	    	
	    	double rotation = 0;
	    	
	        public void handle(long currentNanoTime)
	        {
	            gc.clearRect(0, 0, WIDTH, HEIGHT);
	            
	            x = Math.min(WIDTH-earth.getWidth(), ++x);	// why not x++
	            y = Math.min(HEIGHT-earth.getHeight(), ++y);
	            
	            System.out.println(x + "," + y);
	            gc.drawImage( earth, x, y );
	            
	        }
	    }.start();
	 
	    theStage.show();
	}
	
}
