package com.dktut.java201.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FxTest extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Button btn = new Button();
		btn.setText("Hello World");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello WOrld");
			}
		});
		
		Button btn2 = new Button();
		btn2.setText("Java");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello WOrld");
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		root.getChildren().add(btn2);
		
		Scene scene = new Scene(root, 400, 400);
		
		stage.setScene(scene);
		stage.setTitle("daniel");
		stage.show();
	}
}


