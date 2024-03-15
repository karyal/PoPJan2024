package chart_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LineChartControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			CategoryAxis xAxis    = new CategoryAxis();
			xAxis.setLabel("Devices");

			NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Visits");
	        
			XYChart.Series dataSeries1 = new XYChart.Series();
			dataSeries1.setName("2014");
			dataSeries1.getData().add(new XYChart.Data("Desktop", 178));
			dataSeries1.getData().add(new XYChart.Data("Phone"  , 65));
			dataSeries1.getData().add(new XYChart.Data("Tablet"  , 23));
						
			
			XYChart.Series dataSeries2 = new XYChart.Series();
	        dataSeries2.setName("2015");
	        dataSeries2.getData().add(new XYChart.Data("Desktop", 540));
	        dataSeries2.getData().add(new XYChart.Data("Phone"  , 120));
	        dataSeries2.getData().add(new XYChart.Data("Tablet"  , 36));
	        
	        BarChart     barChart = new BarChart(xAxis, yAxis);
			barChart.getData().add(dataSeries1);			
	        barChart.getData().add(dataSeries2);	        
	        			
			VBox pane = new VBox(barChart);
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