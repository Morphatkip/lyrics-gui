/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;


import Lyrics.Lyrics;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Morphat
 */
public class LyricsMapper implements RowMapper<Lyrics> {
  

    @Override
    public Lyrics mapRow(ResultSet rs, int rowNum) throws SQLException {
      Lyrics lyric =new Lyrics();
      lyric.setArtist(rs.getString("artist"));
      lyric.setGenre(rs.getString("genre"));
      lyric.setGroup(rs.getString("group"));
      lyric.setLyric(rs.getString("lyric"));
      lyric.setTitle(rs.getString("title"));
      
      return lyric;
    }
    
}
