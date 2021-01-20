/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyrics;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Morphat
 */
public class Connector {
    private   static final String url ="jdbc:mysql://localhost:3306/lyrics";
    private  static final String password ="";
    private  static   final String username ="root";
    public static Connection getConnection() throws Exception {
     Class.forName("com.mysql.jdbc.Driver");
     Connection cn =(Connection) DriverManager.getConnection(url, username, password);
     return cn;
    }
}
