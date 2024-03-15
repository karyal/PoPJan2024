package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			FlowPane pane=new FlowPane();
			
			//RadioButton Control
			RadioButton rb1=new RadioButton("Option-1");
			RadioButton rb2=new RadioButton("Option-2");
			
			ToggleGroup toggleGroup1 = new ToggleGroup();
			
			rb1.setToggleGroup(toggleGroup1);
			rb2.setToggleGroup(toggleGroup1);
						
			pane.getChildren().add(rb1);
			pane.getChildren().add(rb2);
			
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