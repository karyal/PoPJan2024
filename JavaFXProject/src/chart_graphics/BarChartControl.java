package chart_graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarChartControl extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			NumberAxis xAxis = new NumberAxis();
			xAxis.setLabel("No of employees");

			NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Revenue per employee");

			LineChart lineChart = new LineChart(xAxis, yAxis);
			
			XYChart.Series dataSeries1 = new XYChart.Series();
			dataSeries1.setName("2014");

			dataSeries1.getData().add(new XYChart.Data( 1, 567));
			dataSeries1.getData().add(new XYChart.Data( 5, 612));
			dataSeries1.getData().add(new XYChart.Data(10, 800));
			dataSeries1.getData().add(new XYChart.Data(20, 780));
			dataSeries1.getData().add(new XYChart.Data(40, 810));
			dataSeries1.getData().add(new XYChart.Data(80, 850));

			lineChart.getData().add(dataSeries1);
			
						        	        			
			VBox pane = new VBox(lineChart);
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