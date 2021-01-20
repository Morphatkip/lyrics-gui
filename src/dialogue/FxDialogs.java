/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogue;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.StageStyle;
import java.lang.String;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
/**
 *
 * @author Morphat
 */
public class FxDialogs {
    public static  String showTextInput(String title,String message,String defaultValue){
      TextInputDialog  dialog= new TextInputDialog();  
      dialog.initStyle(StageStyle.UTILITY);
      dialog.setTitle(title);
      dialog.setContentText(message);
      
      Optional<String> result=dialog.showAndWait();
      if(result.isPresent()){
          return result.get();
      }else {return null;}
      
    }
    public static void showInformation(String title,String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Information");
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
public static String inpuText(String title,String message){
        Alert alert =new Alert(Alert.AlertType.NONE);
       alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Lyrics");
        alert.setHeaderText(title);
        alert.setContentText(message);
        
      
      TextArea textarea =new TextArea(message);
        textarea.setEditable(true);
        textarea.setWrapText(true);
        
        textarea.setMaxWidth(Double.MAX_VALUE);
        textarea.setMinHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textarea,Priority.ALWAYS);
        GridPane.setHgrow(textarea, Priority.ALWAYS);
        
        GridPane expContent =new GridPane();
       
        expContent.add(textarea,0,1);
        
        alert.getDialogPane().setExpandableContent(expContent);
        
        alert.showAndWait();
        return textarea.getText();
    
}
    public static void showException(String title,String message,Exception exception) {
       Alert alert =new Alert(Alert.AlertType.ERROR);
       alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Exception");
        alert.setHeaderText(title);
        alert.setContentText(message);
        
        StringWriter sw =new StringWriter();
        PrintWriter pw= new PrintWriter(sw);
        exception.printStackTrace(pw);
        String exceptionText =sw.toString();
        
        Label label =new Label("Details");
        TextArea textarea =new TextArea(exceptionText);
        textarea.setEditable(false);
        textarea.setWrapText(true);
        
        textarea.setMaxWidth(Double.MAX_VALUE);
        textarea.setMinHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textarea,Priority.ALWAYS);
        GridPane.setHgrow(textarea, Priority.ALWAYS);
        
        GridPane expContent =new GridPane();
        expContent.add(label,0,0);
        expContent.add(textarea,0,1);
        
        alert.getDialogPane().setExpandableContent(expContent);
        
        alert.showAndWait();
    }
}
