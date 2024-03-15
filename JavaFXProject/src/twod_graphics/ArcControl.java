package twod_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ArcControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			Circle circle = new Circle();
			circle.setCenterX(100);
			circle.setCenterY(100);
			circle.setRadius(125);
			circle.setStroke(Color.valueOf("#ff00ff"));
			circle.setStrokeWidth(5);
			circle.setFill(Color.TRANSPARENT);

			VBox pane = new VBox(circle);

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