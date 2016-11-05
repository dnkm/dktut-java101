package com.dktut.temp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FxExample2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Hello Fx");
		
		Group root = new Group();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		final Canvas canvas = new Canvas(400, 200);
		root.getChildren().add(canvas);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		gc.setFill( Color.RED );
		gc.setStroke( Color.BLACK );
		gc.setLineWidth(2);
		Font font = Font.font("Times New Roman", FontWeight.BOLD, 48);
		gc.setFont(font);

		gc.fillText("Hello Fx", 60, 50);
		gc.strokeText("Hello Fx", 60, 50);
		stage.show();
	}
}
