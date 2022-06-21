package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DepartmentListController implements Initializable {
	
	@FXML
	public Button btNew;
	@FXML
	public TableView<Department> tbViewDepartment;
	@FXML
	public TableColumn<Department, Integer> tbColoumId;
	@FXML
	public TableColumn<Department, String> tbColoumName;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("OK");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();	
	}

	private void initializeNodes() {
		tbColoumId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tbColoumName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tbViewDepartment.prefHeightProperty().bind(stage.heightProperty());
	}

}
