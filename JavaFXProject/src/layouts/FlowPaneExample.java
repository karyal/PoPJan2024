package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {			
			// FlowPane Layout
			Label lblID = new Label("ID : ");
			Label lblName = new Label("NAME : ");			
			
			TextField txtID=new TextField();  
	        TextField txtName=new TextField();  
	        
	        Button btnSave=new Button ("SAVE");
	        Button btnClose=new Button ("CLOSE");
	        	        
			FlowPane flowPane=new FlowPane();  	
			flowPane.getChildren().add(lblID);
			flowPane.getChildren().add(txtID);
			flowPane.getChildren().add(lblName);
			flowPane.getChildren().add(txtName);			
			flowPane.getChildren().add(btnSave);
			flowPane.getChildren().add(btnClose);
			
			Scene scene = new Scene(flowPane, 300, 300);
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