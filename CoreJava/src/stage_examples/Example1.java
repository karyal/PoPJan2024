package stage_examples;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Example1 extends Application {
	Stage stage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		stage = new Stage();
		stage.setTitle("Stage-1");
		//stage.setFullScreen(true);
		stage.setMaximized(true);
		stage.show();
		*/
		
		/*
		stage2 = new Stage();
		stage2.setTitle("Stage-2");
		
		boolean isOnTop = stage2.isAlwaysOnTop();
		if(isOnTop==false)
				stage2.setAlwaysOnTop(true);		
		stage2.setAlwaysOnTop(true);
		stage2.show();
		*/
		
		/*
		stage = new Stage();
		boolean result = stage.isAlwaysOnTop();
		System.out.println(result);
		stage.setAlwaysOnTop(true);
		result = stage.isAlwaysOnTop();
		System.out.println(result);
		stage.show();
		*/
		
		//final boolean isFullScreen()
		//final void setFullScreen(boolean value)
		/*
		stage = new Stage();
		boolean result = stage.isFullScreen();
		System.out.println(result);		
		stage.show();
		stage.setFullScreen(true);	
		stage.setMaximized(true);
		*/
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}