/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import Connection.LyricJDBCTemplate;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import dialogue.FxDialogs;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CentreController implements Initializable {
   ApplicationContext context =new ClassPathXmlApplicationContext("Bean.xml");
        
    LyricJDBCTemplate lyricJdbcTemplate =(LyricJDBCTemplate)context.getBean("lyricJDBCTemplate");
     
 private Lyrics_display application;
   public void setApp(Lyrics_display application) { this.application =application;  }
   
   
  
   private  Lyrics_display display;
     @FXML
     private ListView<String> Listview;
     @FXML
    private TextArea viewingscreen;
     @FXML
    private Button search;
     @FXML
    private TextField textsearch;
     @FXML
    private TextArea inputtext;
     @FXML
    private TextField artist;
     @FXML
    private TextField genre;
     @FXML
    private TextField group;
      @FXML
    private TextField title;
     @FXML
    private Button save;
     @FXML
    private CheckBox LyricCheck;

    @FXML
    private CheckBox TitleCheck;

    @FXML
    private CheckBox ArtistCheck;

     

   
     @FXML
    void savee(ActionEvent event) {    
        while (artist.getText().isEmpty() ||inputtext.getText().isEmpty() ||title.getText().isEmpty()) {            
            FxDialogs.showInformation("Error", "artist name and lyrics should not be null ");
        } 
       lyricJdbcTemplate.create(artist.getText(), genre.getText(), group.getText(), inputtext.getText(), title.getText());
       FxDialogs.showInformation("Saved", "successfully saved");
        
    }
     @FXML
  void search(ActionEvent event){
      if(LyricCheck.isSelected()){
          
      }
      if(ArtistCheck.isSelected()){
          
      }
      if(TitleCheck.isSelected()){
          lyricJdbcTemplate.getLyricByTitle(textsearch.getText());
          
      }
    // Search search = new Search(textsearch.getText());
    // search.ListLyrics();
     
     // search.showOnList(Listview,viewingscreen);
  }
  @FXML
      void listview (ActionEvent event){
    
          
  }
      
   @FXML        
   void CheckArtist(ActionEvent event){
     ArtistCheck.isSelected();
   }
   
   @FXML
   void CheckTitle(ActionEvent event){
       TitleCheck.isSelected();
   }
   
   @FXML 
   void CheckLyric(ActionEvent event){
       LyricCheck.isSelected();
   }
   
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
   
}
