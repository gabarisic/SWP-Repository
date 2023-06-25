package swp.MamaMia;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class RndmBsp extends Application {


    public void start(Stage stage) {
        Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("javafx.fxml"));
		} catch (IOException e) {
			System.out.println("could not find my main layout");
			e.printStackTrace();
		}
		
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(RndmBsp.class.getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
  launch(args);
    }

    
  
}