package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			//Initialize Table			
			Text text1 = new Text("This is a JavaFX text.");
			
			Text text2 = new Text("The JavaFX Text control can display a text inside a JavaFX GUI. The JavaFX Text control is represented by the JavaFX class javafx.scene.text.Text . You can set the font to be used by the Text control, text size, font decorations and many other things.");
			text2.setFont(Font.font("Arial", FontWeight.BLACK, 15));
			text2.setFill(Color.GREEN);
			text2.setStroke(Color.BLUE);
			text2.setX(20);
			text2.setY(150);
			text2.setWrappingWidth(450);
			
			VBox pane = new VBox(text1, text2);
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setWidth(350);
			primaryStage.setHeight(250);
			primaryStage.show();

		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}