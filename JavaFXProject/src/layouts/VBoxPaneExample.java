package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxPaneExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {			
			//VBox Layout
			Label lblID = new Label("ID : ");
			Label lblName = new Label("NAME : ");			
			
			TextField txtID=new TextField();  
	        TextField txtName=new TextField();  
	        
	        Button btnSave=new Button ("SAVE");
	        Button btnClose=new Button ("CLOSE");
	        	        
			VBox pane=new VBox();  	
			pane.getChildren().add(lblID);
			pane.getChildren().add(txtID);
			pane.getChildren().add(lblName);
			pane.getChildren().add(txtName);			
			pane.getChildren().add(btnSave);
			pane.getChildren().add(btnClose);
			
			Scene scene = new Scene(pane, 300, 300);
			primaryStage.setScene(scene);			
			primaryStage.show();
			
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}