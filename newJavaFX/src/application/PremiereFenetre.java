package application;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {
	 @Override
	    public void start(Stage primaryStage) {
	        Group root = new Group();
	        Scene scene = new Scene(root, 400, 300);
	        primaryStage.setScene(scene);
	        
	     
	        Line ligne = new Line(100,100, 200, 50);
	        ligne.setStroke(Color.RED);
	        
	      
	        Rectangle rectangle = new Rectangle(150, 150, 100, 50);
	        rectangle.setFill(Color.GREEN);
	        
	   
	        Circle cercle = new Circle(70 , 200, 50);
	        cercle.setFill(Color.YELLOW);
	        
	        root.getChildren().add(ligne);
	        root.getChildren().add(rectangle);
	        root.getChildren().add(cercle);
	        
	        primaryStage.show();
	    }
	public static void main(String[] args) {
	launch(args);
}
}



    
   
    


