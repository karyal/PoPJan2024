package twod_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Rectangle rectangle = new Rectangle();
	        rectangle.setX(200);
	        rectangle.setY(200);
	        rectangle.setWidth(300);
	        rectangle.setHeight(400);
	        rectangle.setStroke(Color.TRANSPARENT);
	        rectangle.setFill(Color.valueOf("#00ffff"));
	        
			VBox pane = new VBox(rectangle);			
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