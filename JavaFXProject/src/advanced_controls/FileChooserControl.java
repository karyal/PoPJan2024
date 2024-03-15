package advanced_controls;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {

			FileChooser fileChooser = new FileChooser();
			//File selectedFile = fileChooser.showOpenDialog(primaryStage);
			
			Button button1 = new Button("Button 1");			
			button1.setOnAction(action -> {
				File selectedFile = fileChooser.showOpenDialog(primaryStage);
				System.out.println(selectedFile.getAbsolutePath());
			});									

			VBox pane = new VBox(button1);
			
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setWidth(550);
			primaryStage.setHeight(350);
			primaryStage.show();

		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}