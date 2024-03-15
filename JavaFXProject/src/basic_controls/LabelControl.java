package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabelControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			StackPane root = new StackPane();
			Scene scene = new Scene(root, 300, 300);
			primaryStage.setScene(scene);

			// Label Control
			Label lblTest;
			lblTest = new Label();
			lblTest.setText("Hello World of JavaFX");

			Label lblTest2 = new Label("Welcome to our College");			
			
			root.getChildren().add(lblTest);
			root.getChildren().add(lblTest2);
			
			primaryStage.show();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
