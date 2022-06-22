module javafx_jdbc {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;
	
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	
	exports gui;
	exports model.entities;
	
}
