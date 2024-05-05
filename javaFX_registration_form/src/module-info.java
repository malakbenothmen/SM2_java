module javaFX_registration_form {
	opens example to javafx.graphics,javafx.fxml;
	requires javafx.controls;
	requires javafx.fxml;
	
	

	
	opens application to javafx.graphics, javafx.fxml;
}
