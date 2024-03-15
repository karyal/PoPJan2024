package chart_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PieChartControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			PieChart pieChart = new PieChart();
			PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
	        PieChart.Data slice2 = new PieChart.Data("Phone"  , 67);
	        PieChart.Data slice3 = new PieChart.Data("Tablet" , 36);
	        
	        pieChart.getData().add(slice1);
	        pieChart.getData().add(slice2);
	        pieChart.getData().add(slice3);
	        
			VBox pane = new VBox(pieChart);
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