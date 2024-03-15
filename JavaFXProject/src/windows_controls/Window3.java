package windows_controls;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Window3 extends Application {
	Button btnShow2;
	Stage secondaryStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Secondary Window
		btnShow2 = new Button("Show Window1");		
		FlowPane pane2 = new FlowPane();
		pane2.getChildren().add(btnShow2);
		Group group2 = new Group(pane2);
		Scene scene2 = new Scene(group2, 250, 250, Color.GRAY);
		secondaryStage=new Stage();
		secondaryStage.setScene(scene2);		
		secondaryStage.show();		
	}

	public Window3(String []args) {
		launch(args);
	}
	public static void main(String[] args) {
		new Window3(args);
	}
}