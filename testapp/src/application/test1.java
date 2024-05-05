package application;
import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class test1 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	BorderPane root = new BorderPane();
	Button btl = new Button ("Bonjour") ;
	BorderPane.setMargin(btl, new Insets (20, 20, 20, 20)) ;
	BorderPane.setAlignment(btl, Pos.BOTTOM_CENTER) ; root.setTop(btl);
	Circle C = new Circle(30);
	BorderPane. setMargin(C, new Insets(20, 20, 20, 20)); root. setCenter (C);
	Text Tx = new Text("DS POA");
	BorderPane.setMargin(Tx, new Insets(20, 20, 20, 20));
	BorderPane. setAlignment (Tx, Pos.BOTTOM_CENTER) ; root.setBottom(Tx);
	Scene scene = new Scene(root, 550, 250);
	primaryStage.setTitle("Interface Graphique JavaFx"); primaryStage.setScene(scene);
	primaryStage.show();
	}	
		
	public static void main(String[] args) {
	launch (args) ;
     }

}
	
