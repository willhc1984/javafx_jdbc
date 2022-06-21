package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	public MenuItem menuItemSeller;
	@FXML
	public MenuItem menuItemDeparment;
	
	@FXML
	public void onMenuItemSeller() {
		System.out.println("OK");
	}
	
	@FXML
	public void onMenuItemDepatment() {
		System.out.println("OK");
		
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
