package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			TreeView treeView = new TreeView();
			
			TreeItem rootItem = new TreeItem("Tutorials");

			TreeItem webItem = new TreeItem("Web Tutorials");
			webItem.getChildren().add(new TreeItem("HTML  Tutorial"));
			webItem.getChildren().add(new TreeItem("HTML5 Tutorial"));
			webItem.getChildren().add(new TreeItem("CSS Tutorial"));
			webItem.getChildren().add(new TreeItem("SVG Tutorial"));
			rootItem.getChildren().add(webItem);

			TreeItem javaItem = new TreeItem("Java Tutorials");
			javaItem.getChildren().add(new TreeItem("Java Language"));
			javaItem.getChildren().add(new TreeItem("Java Collections"));
			javaItem.getChildren().add(new TreeItem("Java Concurrency"));
			rootItem.getChildren().add(javaItem);
			
			treeView.setRoot(rootItem);
			
			VBox pane = new VBox(treeView);			
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