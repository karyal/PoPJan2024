package windows_controls;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Window2 extends Application {
	Button btnShow1;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		//Default Window
		btnShow1 = new Button("Show Window2");
		FlowPane pane1 = new FlowPane();
		pane1.getChildren().add(btnShow1);
		Group group1 = new Group(pane1);		
		Scene scene1 = new Scene(group1, 450, 350, Color.LIGHTSKYBLUE);		
		primaryStage.setScene(scene1);		
		primaryStage.show();
		
		btnShow1.setOnAction((event) -> {// lambda expression		         
			scene1.getWindow().hide();			
	    });
	}

	public static void main(String[] args) {
		launch(args);
	}
}