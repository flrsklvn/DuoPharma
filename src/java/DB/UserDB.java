/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Myron-Laptop
 */
public class UserDB {
 
    public ArrayList<User> getAllUsers(){
        ArrayList<User> userList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from user order by userID";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                userList = new ArrayList();
                User user;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                  
                  user = new User();
                  user.setUserID(rs.getInt("userID"));
                  user.setType(rs.getString("type"));
                  user.setPassword(rs.getString("password"));
                  user.setName(rs.getString("name"));
                  user.setLocationHandled(rs.getInt("locationHandled"));
                  user.setContactNo(rs.getString("contactNo"));
                  
                  userList.add(user);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }
}
