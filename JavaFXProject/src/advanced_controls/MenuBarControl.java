package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuBarControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			MenuBar menuBar = new MenuBar();
			
			Menu menu1 = new Menu("Menu 1");						
			Menu menu2 = new Menu("Menu 2");
			menu2.setGraphic(new ImageView("file:resources/images/image2.png"));
						
			MenuItem menuItem1 = new MenuItem("Item 1");
			menuItem1.setOnAction(e -> {
			    System.out.println("Menu Item 1 Selected");
			});
			MenuItem menuItem2 = new MenuItem("Item 2");
			menuItem2.setOnAction(e -> {
			    System.out.println("Menu Item 2 Selected");
			});
			
			menu1.getItems().add(menuItem1);
			menu1.getItems().add(menuItem2);
			
			menuBar.getMenus().add(menu1);
			menuBar.getMenus().add(menu2);
			
			VBox pane = new VBox(menuBar);			
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