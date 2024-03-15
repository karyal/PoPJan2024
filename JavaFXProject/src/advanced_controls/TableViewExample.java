package advanced_controls;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewExample extends Application {	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			//Initialize Table
			TableView<PersonNew> table1= new TableView<PersonNew>();
			ObservableList<PersonNew> data = FXCollections.observableArrayList(
			            new PersonNew(1, "Kiran Rai"),
			            new PersonNew(2, "Rosha Thapa"),
			            new PersonNew(3, "Rose Shrestha"),
			            new PersonNew(4, "Ramesh Sharma"),
			            new PersonNew(5, "Kabita Nepal")
			        );
			
			//Initialize Table Column
			TableColumn<PersonNew, Integer> colPID = new TableColumn<>("PERSON ID");
			colPID.setCellValueFactory(new PropertyValueFactory<>("personID"));
			colPID.setMinWidth(75);
			
			TableColumn<PersonNew, Integer> colFullName = new TableColumn<>("FULL NAME");
			colFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
			colFullName.setMinWidth(250);
			
			table1.getColumns().addAll(colPID, colFullName);			
			table1.setItems(data);
			
			VBox pane = new VBox(table1);
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}