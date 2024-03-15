package advanced_controls;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FontExample extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			//Initialize Table			
			FileInputStream input = new FileInputStream("resources/images/image1.png");
			Image image = new Image(input);
			ImageView imageView = new ImageView(image);
			
			VBox pane = new VBox(imageView);
			Scene scene = new Scene(pane);
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