/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Lyrics.Lyrics;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class LyricJDBCTemplate implements LyricsDAO {
    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
       this.dataSource=ds;
       this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String artist,String genre,String band,String lyric,String title) {
       String SQL ="insert into Details (artist, Genre,band,lyrics,title) Values(?,?,?,?,?)";
       jdbcTemplateObject.update(SQL,artist,genre,band,lyric,title);
      
    }

    @Override
    public Lyrics getLyricByTitle(String title) {
       String SQL ="select * from details where title like '%"+title+"%'";
       Lyrics lyric =jdbcTemplateObject.queryForObject(SQL, new Object []{title},new LyricsMapper());
       return lyric;
    }

    @Override
    public List<Lyrics> listStudents() {
       String SQL ="select * from details";
       List<Lyrics> lyrics =jdbcTemplateObject.query(SQL, new LyricsMapper());
       return lyrics;
       
    }

    @Override
    public void delete(String title) {
        String SQL = "delete from details where id =?";
        jdbcTemplateObject.update(SQL,title);
        return;
    }

    @Override
    public void update(String title, String lyrics, String genre, String artist) {
        String SQL ="update Student set age =? where idi =?";
        
    }

    

  

    
    
}
