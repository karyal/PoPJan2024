package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuButtonExample extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			//Initialize Table			
			Hyperlink link1 = new Hyperlink("http://google.com.np");						
			link1.setOnAction(e -> {
			    System.out.println("Clicked on Hypertext");
			});
			
			VBox pane = new VBox(link1);
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