package advanced_controls;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollPaneControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			ScrollPane scrollPane = new ScrollPane();

			String imagePath = "./resources/images/image3.png";
			ImageView imageView = new ImageView(new Image(new FileInputStream(imagePath)));
			scrollPane.setContent(imageView);
			scrollPane.setPrefSize(500, 250);
			scrollPane.pannableProperty().set(true);
			scrollPane.fitToWidthProperty().set(true);
			scrollPane.fitToHeightProperty().set(true);
			
			scrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.ALWAYS);
			scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.ALWAYS);
						
			VBox pane = new VBox(scrollPane);
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