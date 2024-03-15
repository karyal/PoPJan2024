package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SliderControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		try {

			Slider slider = new Slider(0, 100, 0);

			Button btnReadValue = new Button("GET DATE");
			btnReadValue.setOnAction(action -> {
				System.out.println(slider.getValue());
			});

			VBox pane = new VBox(slider, btnReadValue);
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