module javaFX_registration_form_fxml {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
