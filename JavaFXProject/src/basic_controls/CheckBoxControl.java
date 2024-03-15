package basic_controls;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBoxControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			HBox pane=new HBox();
			
			//CheckBox Control
			CheckBox cb1=new CheckBox("Option-1");
			CheckBox cb2=new CheckBox("Option-2");					
						
			pane.getChildren().add(cb1);
			pane.getChildren().add(cb2);
			
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
