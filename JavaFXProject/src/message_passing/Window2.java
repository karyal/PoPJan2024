package message_passing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Window2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btn1 = new Button("Click Me");	
			btn1.setOnAction((event) -> {// lambda expression		         
				System.out.println("Click Me Clicked");
		    });
			FlowPane pane = new FlowPane(btn1);
			Scene scene = new Scene(pane, 400, 400);			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}