/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Myron-Laptop
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnectionFactoryImp extends DBConnectionFactory{
    @Override
    public Connection getConnection(){
      try{  
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
      } catch (ClassNotFoundException | SQLException ex){
          Logger.getLogger(DBConnectionFactoryImp.class.getName()).log(Level.SEVERE, null, ex);
      }
       return null;
    }
}
