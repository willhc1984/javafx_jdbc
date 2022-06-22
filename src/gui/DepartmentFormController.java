package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{
	
	@FXML
	public TextField txtId;
	@FXML
	public TextField txtName;	
	@FXML
	public Label labelErrorName;	
	@FXML
	public Button btSave;	
	@FXML
	public Button btCancel;	
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("OK");
	}
	@FXML
	public void onBtCancelAction() {
		System.out.println("OK");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		inicializeNodes();
	}
	
	private void inicializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}

}
