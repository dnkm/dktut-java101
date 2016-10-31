package com.dktut.java201.clashfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FxTest1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Whatever");
		
		Group root = new Group();
		Scene scene = new Scene( root );
		stage.setScene(scene);
		
		final Canvas canvas = new Canvas( 400, 200 );
		root.getChildren().add(canvas);
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		gc.setFill( Color.RED );
		gc.setStroke( Color.BLACK );
		gc.setLineWidth(2);
		Font font1 = Font.font("Times New Roman", FontWeight.BOLD, 48);
		gc.setFont(font1);
		
		gc.fillText("Hello World!",  60, 50);
		gc.strokeText("Hello World!", 60, 50);
		
		stage.show();
	}
}
