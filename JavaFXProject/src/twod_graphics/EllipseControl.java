package twod_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Ellipse ellipse = new Ellipse();   
			
			ellipse.setCenterX(300.0f); 
			ellipse.setCenterY(150.0f); 
			ellipse.setRadiusX(150.0f); 
			ellipse.setRadiusY(75.0f);

			VBox pane = new VBox(ellipse);

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