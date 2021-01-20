/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyrics;

import dialogue.FxDialogs;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;


public class Search {
    /*
    String valtosearch;
     ArrayList<lyrics>lyricslist=new ArrayList<>();
    public Search(String valtosearch){
        this.valtosearch =valtosearch;
    }
   public ArrayList<lyrics> ListLyrics(){
      
       Statement st;
       ResultSet rs;
       try{
           Connection cn=Connector.getConnection();
           st=cn.createStatement();
          String searchQuery ="select * from details where artist like '%"+valtosearch+"%'";
          rs=st.executeQuery(searchQuery);
          lyrics lyric;
          while (rs.next()){
              lyric =new lyrics(rs.getString("artist"),rs.getString("lyrics"),rs.getString("band"),
              rs.getString("Genre"),rs.getString("Title"));
                lyricslist.add(lyric);
          }
       }catch (Exception e){
           FxDialogs.showException("", valtosearch, e);
       }
       return lyricslist;
   }
   ListView<String> listview=new ListView<>();
   public void showOnList(ListView listview,TextArea textarea){
       this.listview=listview;
      lyricslist.forEach(x->{
          String m= x.getlyric();
        listview.getItems().add(x.getTitle());
           listview.getSelectionModel().selectedItemProperty().addListener(
           new ChangeListener<String>(){
               public void changed(ObservableValue<? extends String> ov,
                       String old_val,String new_val){
                       textarea.setText("Artist:" + x.getArtist() +"\n "+ x.getlyric());
                     }
                   });
      });
    
     
   }
*/
       
}
