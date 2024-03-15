package windows_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Window4 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox pane = new VBox();
		Scene scene = new Scene(pane);

		primaryStage.setTitle("Primary Stage");
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setScene(scene);

		primaryStage.initStyle(StageStyle.DECORATED);
		// primaryStage.initStyle(StageStyle.UNDECORATED);
		// primaryStage.initStyle(StageStyle.TRANSPARENT);
		// primaryStage.initStyle(StageStyle.UNIFIED);
		// primaryStage.initStyle(StageStyle.UTILITY);

		primaryStage.show();

		Stage stage2 = new Stage();
		stage2.setTitle("Secondary Stage");
		stage2.setX(500);
		stage2.setY(500);
		stage2.setWidth(600);
		stage2.setHeight(300);

		stage2.initOwner(primaryStage);
		// stage.initModality(Modality.NONE);
		stage2.initModality(Modality.WINDOW_MODAL);
		// stage.initModality(Modality.APPLICATION_MODAL);

		stage2.showAndWait();
	}

	public static void main(String[] args) {
		launch(args);
	}
}