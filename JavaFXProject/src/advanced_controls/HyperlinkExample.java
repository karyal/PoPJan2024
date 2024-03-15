package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HyperlinkExample extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			Hyperlink link1 = new Hyperlink("Click Me!");
			
			Hyperlink link2 = new Hyperlink("http://google.com.np");
			link2.setOnAction(e -> {
			    System.out.println("google.com.np clicked!");
			});
			
			VBox pane = new VBox(link1, link2);
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