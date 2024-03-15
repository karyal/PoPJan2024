package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgressBarControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {

			ProgressBar progressBar = new ProgressBar(0);
			progressBar.setProgress(0.5);
			
			Button button1 = new Button("Button 1");			
			button1.setOnAction(action -> {
				System.out.println("Button-1 Clicked");
			});						

			Button button2 = new Button("Button 2");
			//button2.setTooltip(tooltip2);			
			button2.setOnAction(action -> {
				System.out.println("Button-2 Clicked");
			});
						

			VBox pane = new VBox(progressBar);
			
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