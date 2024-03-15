package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			HBox pane=new HBox();
			
			//CmboBox Control
			ComboBox cmb1=new ComboBox();
			cmb1.getItems().add("1-15");
			cmb1.getItems().add("16-30");
			cmb1.getItems().add("31-45");
			cmb1.getItems().add("45+");			
						
			pane.getChildren().add(cmb1);
			//pane.getChildren().add(cb2);
			
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
