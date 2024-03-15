package message_passing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WindowAlert extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btn1 = new Button("Click Me");	
			btn1.setOnAction((event) -> {// lambda expression		         
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warning");
				alert.setHeaderText("Are you sure?");
				alert.setContentText("Do you want to close the application?");
				//Set custom buttons
				ButtonType okButton= new ButtonType("Yes, exit");
				ButtonType cancelButton= new ButtonType("No, do not exit", ButtonData.CANCEL_CLOSE);
				alert.getButtonTypes().setAll(okButton, cancelButton);
				//Prevent all interaction with application until resolved.
				alert.initModality(Modality.APPLICATION_MODAL);
				//Launch
				alert.showAndWait();
		    });
			FlowPane pane = new FlowPane(btn1);
			Scene scene = new Scene(pane, 400, 400);			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}