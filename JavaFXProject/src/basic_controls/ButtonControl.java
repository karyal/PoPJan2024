package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {	
			FlowPane pane=new FlowPane();
			
			//Button Control
			Button btnSave;
			btnSave = new Button();
			btnSave .setText("SAVE");
						
			Button btnClose = new Button("CLOSE");			
			
			pane.getChildren().add(btnSave);
			pane.getChildren().add(btnClose);
			
			Scene scene = new Scene(pane, 550, 300);
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