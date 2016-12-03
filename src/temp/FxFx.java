package temp;

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

public class FxFx extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400);
		
		List<Circle> circleList = new ArrayList<>();
		
		new AnimationTimer() {
			
			double t = 0; 
			
			@Override
			public void handle(long now) {
				shiftLeft();
				
				t += Math.PI/100;
				
				double y1 = scene.getHeight()/2 + scene.getHeight()/4*Math.sin(t);
				double y2 = scene.getHeight()/2 + scene.getHeight()/4*Math.cos(t);
				double y3 = scene.getHeight()/2 + scene.getHeight()/4*Math.sin(t+Math.PI);
				
				Circle c1 = new Circle(scene.getHeight()/2, y1, 10d, Color.SKYBLUE);
				Circle c2 = new Circle(scene.getHeight()/2, y2, 10d, Color.HOTPINK);
				Circle c3 = new Circle(scene.getHeight()/2, y3, 10d, Color.ORANGE);
				
				root.getChildren().add(c1);
				root.getChildren().add(c2);
				root.getChildren().add(c3);
				circleList.add(c1);
				circleList.add(c2);
				circleList.add(c3);
				
			}
			
			private void shiftLeft() {
				
				Iterator<Circle> it = circleList.iterator();
				while(it.hasNext()) {
					Circle c = it.next();
					c.setCenterX(c.getCenterX()-1);
					c.setRadius(c.getRadius()*0.99d);
					
					if (c.getCenterX() < 0) {
						it.remove();
						root.getChildren().remove(c);
					}
				}
			}
			
		}.start();
		
		stage.setScene(scene);
		stage.show();
	}
}
