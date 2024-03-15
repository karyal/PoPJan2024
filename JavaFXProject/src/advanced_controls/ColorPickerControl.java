package advanced_controls;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorPickerControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			DatePicker datePicker = new DatePicker();
			
			Button btnReadDate = new Button("GET DATE");
			btnReadDate.setOnAction(action -> {
	            LocalDate datevalue = datePicker.getValue();
	            System.out.println(datevalue);
	        });
			
			VBox pane = new VBox(datePicker, btnReadDate);
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