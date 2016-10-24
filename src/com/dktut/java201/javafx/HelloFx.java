package com.dktut.java201.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFx extends Application {
	
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn = new Button();
		btn.setText("Say Hello Fx");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello Fx");
			}
			
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello Fx!");
		primaryStage.show();
	}
	
}
