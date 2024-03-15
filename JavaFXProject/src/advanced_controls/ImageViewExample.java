package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ImageViewExample extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			//Initialize Table			
			Label lblOffice = new Label("ABC INC");
			Label lblAddress= new Label("Kalanki, Kathmandu, Nepal");
			Font font1 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 13);
			lblAddress.setFont(font1);
			
			VBox pane = new VBox(lblOffice, lblAddress);
			Scene scene = new Scene(pane);
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