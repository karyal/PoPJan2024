package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ChoiceBoxControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			HBox pane=new HBox();
			
			//ChoiceBox Control
			ChoiceBox choiceBox = new ChoiceBox();			
			choiceBox.getItems().add("Choice 1");
			choiceBox.getItems().add("Choice 2");
			choiceBox.getItems().add("Choice 3");
			
			pane.getChildren().add(choiceBox);
			//pane.getChildren().add(cb2);
			
			Scene scene = new Scene(pane, 300, 300);
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