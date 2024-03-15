package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			FlowPane pane=new FlowPane();
			
			//TextField Control
			TextField txt1;
			txt1 = new TextField();
			txt1.setText("<enter id>");

			TextField txt2= new TextField("<enter name>");			
			
			pane.getChildren().add(txt1);
			pane.getChildren().add(txt2);
			
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