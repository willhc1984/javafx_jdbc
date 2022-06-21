package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;
import model.services.DepartmentService;

public class DepartmentListController implements Initializable {
	
	public DepartmentService service;
	
	@FXML
	public Button btNew;
	@FXML
	public TableView<Department> tbViewDepartment;
	@FXML
	public TableColumn<Department, Integer> tbColoumId;
	@FXML
	public TableColumn<Department, String> tbColoumName;
	
	public ObservableList<Department> obsList;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("OK");
	}
	
	public void setDepartmentService(DepartmentService service) {
		this.service = service;
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
	
	public void updateTableViesw() {
		if(service == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Department> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tbViewDepartment.setItems(obsList);
	}

}
