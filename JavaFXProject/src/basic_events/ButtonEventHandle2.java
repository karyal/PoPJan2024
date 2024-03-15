package basic_events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonEventHandle2 extends Application{
	Button btnSave;
	Button btnClose;
	Scene scene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {								
			//Button Control & Event-2			
			btnSave = new Button();
			btnSave .setText("SAVE");
			btnSave.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	System.out.println("Record save successfully");
	            }
	        });	
			
			btnClose = new Button("CLOSE");	
			btnClose.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	scene.getWindow().hide();
	            }
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