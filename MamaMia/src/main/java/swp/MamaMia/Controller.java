package swp.MamaMia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.util.Duration;

public class Controller{

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button btnDatei;

    @FXML
    private Text l1;
    @FXML
    private Text spieler1;

    @FXML
    private Text spieler2;

    @FXML
    private Button start;
    private  ArrayList<String> lines = new ArrayList<>();;
    private File selectedFile;
    private String spruch;
    boolean wechsel=true;
    boolean einmalstart=true;
    
    int sp1=0;
    int sp2=0;
    
    @FXML
    private AnchorPane back;
    
    
    @FXML
    private void openFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wählen Sie eine Textdatei aus");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Textdateien", "*.txt"));

        
        selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            System.out.println("Datei ausgewählt");
        }
        


        try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
            String line=br.readLine();
            while ((line = br.readLine()) != null) {
            	int i = 0;
            		
            		lines.add(line) ;
            		i++;
            		 System.out.println(line);
                }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    
    @FXML
    private void start() {
    	
    	 int randomDelay = new Random().nextInt(7000) + 3000;
    	 Platform.runLater(() -> bt1.setStyle("-fx-background-color: white"));
         Platform.runLater(() -> bt2.setStyle("-fx-background-color: white;"));
         
         Thread thread = new Thread(() -> {
             try {
                 Thread.sleep(randomDelay);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             wechsel=true;
             
             Platform.runLater(() -> bt1.setStyle("-fx-background-color: red;"));
             Platform.runLater(() -> bt2.setStyle("-fx-background-color: red;"));
             
         });
         thread.setDaemon(true);
         thread.start();
     }
    
    @FXML
    private void spruch() {
    	 Random random = new Random();
         int index = random.nextInt(lines.size());
         String randomText = lines.get(index);
         l1.setText(randomText);
        
    }
    
    
   @FXML
    private void handleKeyPressed(KeyEvent event) {
	   if(wechsel==true) {
        if (event.getCode().toString().equals("W")) {
            
            bt1.setStyle("-fx-background-color: green;");
            bt2.setStyle("-fx-background-color: red;");
            wechsel=false;
            einmalstart=true;
            sp1++;
            spieler1.setText("Spieler 1: "+sp1);
            spruch();
        }
        if (event.getCode().toString().equals("U")) {
       
            bt1.setStyle("-fx-background-color: red;");
            bt2.setStyle("-fx-background-color: green;");
            wechsel=false;
            einmalstart=true;
            sp2++;
            spieler2.setText("Spieler 2: "+sp2);
            spruch();
            
        }
	   }
	   
	   if (event.getCode().toString().equals("S") && wechsel==false && einmalstart==true) {       
          start();  
          einmalstart=false;
       }
	   
    }
}



    



