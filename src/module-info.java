module javafx_jdbc {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	
	exports gui;
	exports model.entities;
}
