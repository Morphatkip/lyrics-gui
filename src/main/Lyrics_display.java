
package main;

import Lyrics.Lyrics;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Lyrics_display extends Application {
    private Stage stage;
    
    @Override
    public void start(Stage primarystage) throws Exception {
        stage =primarystage;
        gotocentre();
        primarystage.show();
    }

    public static void main(String[] args) {
        Application.launch(Lyrics_display.class, (java.lang.String[])null);
       Lyrics lyric =new Lyrics();
    }
    private  void gotocentre(){
       try {  
         CentreController centre =  (CentreController) replacescene("centre.fxml");
         centre.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Lyrics_display.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public  void gototext(){
       try {  
          text txt =  (text) replacescene("text.fxml");
          txt.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Lyrics_display.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private Initializable replacescene(String fxml) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        InputStream in=Lyrics_display.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Lyrics_display.class.getResource(fxml));
        AnchorPane page;
        try{
            page =(AnchorPane) loader.load(in);
        }finally{
            in.close();
        }
        Scene scene = new Scene(page,800,600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
    
}
