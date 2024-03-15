package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContextMenuControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			ContextMenu contextMenu = new ContextMenu();
	        MenuItem menuItem1 = new MenuItem("Choice 1");
	        MenuItem menuItem2 = new MenuItem("Choice 2");
	        MenuItem menuItem3 = new MenuItem("Choice 3");
	        menuItem3.setOnAction((event) -> {
	            System.out.println("Choice 3 clicked!");
	        });
	        contextMenu.getItems().addAll(menuItem1,menuItem2,menuItem3);
	        TextArea textArea = new TextArea();
	        textArea.setContextMenu(contextMenu);
	        
			VBox pane = new VBox(textArea);			
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