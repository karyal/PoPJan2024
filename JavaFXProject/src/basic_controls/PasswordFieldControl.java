package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PasswordFieldControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {	
			FlowPane pane=new FlowPane();
			
			//PasswordField Control
			PasswordField txt1;
			txt1 = new PasswordField();					
			
			pane.getChildren().add(txt1);					
			
			Scene scene = new Scene(pane, 300, 300);
			primaryStage.setScene(scene);			
			primaryStage.show();
			
			primaryStage.show();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}