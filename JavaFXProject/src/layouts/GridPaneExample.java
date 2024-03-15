package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {			
			// GridPane Layout
			Label lblID = new Label("ID : ");
			Label lblName = new Label("NAME : ");			
			
			TextField txtID=new TextField();  
	        TextField txtName=new TextField();  
	        
	        Button btnSave=new Button ("SAVE");
	        Button btnClose=new Button ("CLOSE");
	        
	        
			GridPane gridPane=new GridPane();  	
			gridPane.addRow(0, lblID, txtID);
			gridPane.addRow(1, lblName, txtName);
			gridPane.addRow(2, btnSave, btnClose);
			
			Scene scene = new Scene(gridPane, 300, 300);
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