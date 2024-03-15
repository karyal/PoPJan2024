package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextAreaControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {	
			FlowPane pane=new FlowPane();
			
			//TextArea Control
			TextArea txt1;
			txt1 = new TextArea();
			txt1 .setMinWidth(20);
			txt1 .setMinHeight(50);			
			pane.getChildren().add(txt1);					
			
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