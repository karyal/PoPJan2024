package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListViewControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {			
			
			HBox pane=new HBox();			
			
			// ListView Control
			ListView lv1=new ListView();
			lv1.getItems().add("1-15");
			lv1.getItems().add("16-30");
			lv1.getItems().add("31-45");
			lv1.getItems().add("45+");			
			lv1.setPrefWidth(100);
			lv1.setMaxHeight(75);
						
			pane.getChildren().add(lv1);
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
