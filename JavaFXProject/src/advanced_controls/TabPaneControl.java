package advanced_controls;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabPaneControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			TabPane tabPane = new TabPane();

			Tab tab1 = new Tab("Planes", new Label("Show all planes available"));
			Tab tab2 = new Tab("Cars", new Label("Show all cars available"));
			Tab tab3 = new Tab("Boats", new Label("Show all boats available"));

			tabPane.getTabs().add(tab1);
	        tabPane.getTabs().add(tab2);
	        tabPane.getTabs().add(tab3);
	        			
			VBox pane = new VBox(tabPane);
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