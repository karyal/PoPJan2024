package basic_controls;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Stage, Scene, and Scene Graph/Nodes
			Group group = new Group();
			Scene scene = new Scene(group, 250, 250);		
			primaryStage.setScene(scene);					
			primaryStage.show();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}