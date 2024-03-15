package advanced_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorControl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			HTMLEditor htmlEditor = new HTMLEditor();
			String htmlText = htmlEditor.getHtmlText();
			String htmlText1 = "<b>Bold text</b>";
			htmlEditor.setHtmlText(htmlText);
			
			VBox pane = new VBox(htmlEditor);
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setWidth(550);
			primaryStage.setHeight(350);
			primaryStage.show();

		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}