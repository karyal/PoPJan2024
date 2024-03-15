package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DatePicketControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			Text text1 = new Text("This is a JavaFX text.");
			ColorPicker colorPicker = new ColorPicker();
			 
			Button btnReadColor= new Button("GET DATE");
			btnReadColor.setOnAction(action -> {
				Color colorValue = colorPicker.getValue();
				text1.setStroke(colorValue);
	        });
			
			VBox pane = new VBox(text1, colorPicker, btnReadColor);
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