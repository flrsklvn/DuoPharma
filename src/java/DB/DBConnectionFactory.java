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

public abstract class DBConnectionFactory {
    String url = "jdbc:mysql://localhost:3306/thes01";
        String username = "root";
        String password = "0105";
        
    public static DBConnectionFactory getInstance(){
        return new DBConnectionFactoryImp();
    }
    
    public abstract Connection getConnection();
}
