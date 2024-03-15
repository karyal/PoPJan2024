package windows_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstGUI extends Application {
	static boolean result;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("My First JavaFX GUI");
		Label labelmain = new Label();
		Button buttonmain = new Button("Click to go to pop up window");
		buttonmain.setOnAction(e -> {
			result = Popup.display();
			if (result == true) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		});

		VBox layout = new VBox(20);
		layout.getChildren().addAll(labelmain, buttonmain);
		Scene scene1 = new Scene(layout, 300, 250);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}