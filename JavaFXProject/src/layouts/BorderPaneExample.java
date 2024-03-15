package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			//Border Pane
			Label lblTest;
			lblTest = new Label();
			lblTest.setText("Hello World of JavaFX");

			Label lblTest2 = new Label("Welcome to our College");			
			
			BorderPane borderPane = new BorderPane();			
			borderPane.setLeft(lblTest);
			borderPane.setRight(lblTest2);
			Scene scene = new Scene(borderPane, 300, 300);
			primaryStage.setScene(scene);			
			primaryStage.show();
			
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}