package basic_events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonEventHandle extends Application implements EventHandler<ActionEvent> {
	Button btnSave;
	Button btnClose;
	Scene scene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {								
			//Button Control & Event-1	
			btnSave = new Button();
			btnSave .setText("SAVE");
						
			btnClose = new Button("CLOSE");			
			
			btnSave.setOnAction(this);
			btnClose.setOnAction(this);
			
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

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==btnClose) {
			//System.exit(0);
			//((Node)(event.getSource())).getScene().getWindow().hide();
			scene.getWindow().hide();
		}
		else if(event.getSource()==btnSave) {
			System.out.println("Save!");
		}		
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}