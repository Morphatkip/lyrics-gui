/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Lyrics.Lyrics;
import java.util.List;
import javax.sql.DataSource;


public interface LyricsDAO {
    /*
    This is the method to be used to initialize 
    database resources ie. connection 
    */
    
    public void setDataSource(DataSource ds);
    
    /*
    this is the method to create  a record in thr lyrics table
    
    */
    
    public void create(String artist,String genre,String band,String lyric,String title);
    
    /*
    This is the methid to be used to list down 
    all the records from the lyrics correspondin to a passed lyric
    */
    public Lyrics getLyricByTitle(String title);
    
    /*
    This is the method to be used to list down 
    all the records fro the student table
    */
    public List<Lyrics> listStudents();
    
    /*This is the to be used to delete a record from the 
    the studet table corresponding to a passed lyrics title
    */
    public void delete(String title);
    
    /*
    This is the method to be used to update
    a record into the Student table
    */
    public void update(String title,String lyrics,String genre,String artist);
    
    /*
    
    */
}
