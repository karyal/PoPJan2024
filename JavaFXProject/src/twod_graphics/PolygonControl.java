package twod_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class PolygonControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Arc arc = new Arc();
			
			arc.setCenterX(300.0f); 
			arc.setCenterY(150.0f); 
			arc.setRadiusX(90.0f); 
			arc.setRadiusY(90.0f); 
			arc.setStartAngle(40.0f); 
			arc.setLength(239.0f);
			arc.setType(ArcType.ROUND);
			
			VBox pane = new VBox(arc);

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