package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TooltipControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {

			ToolBar toolBar = new ToolBar();
			Tooltip tooltip1 = new Tooltip("Tip-1");
			Tooltip tooltip2 = new Tooltip("Tip-2");
			Tooltip tooltip3 = new Tooltip();
			tooltip3.setGraphic(new ImageView("file:resources/images/image2.png"));
			
			Button button1 = new Button("Button 1");
			button1.setTooltip(tooltip1);
			button1.setOnAction(action -> {
				System.out.println("Button-1 Clicked");
			});						

			Button button2 = new Button("Button 2");
			//button2.setTooltip(tooltip2);
			button2.setTooltip(tooltip3);
			button2.setOnAction(action -> {
				System.out.println("Button-2 Clicked");
			});
			
			toolBar.getItems().add(button1);			
			toolBar.getItems().add(button2);

			VBox pane = new VBox(toolBar);
			
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