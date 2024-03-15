package basic_events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonEventHandle3 extends Application{
	Button btnSave;
	Button btnClose;
	Scene scene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {								
			//Button Control & Event-3			
			btnSave = new Button();
			btnSave.setText("SAVE");
			btnSave.setOnAction((event) -> {// lambda expression		         
				System.out.println("Record saved!");
		    });
			
			
			btnClose = new Button("CLOSE");	
			btnClose.setOnAction((event) -> {// lambda expression		         
				scene.getWindow().hide();
		    });							
			
			FlowPane pane=new FlowPane();	
			pane.getChildren().add(btnSave);
			pane.getChildren().add(btnClose);			
			scene = new Scene(pane, 550, 300);
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