/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Entities.Location;
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
public class LocationDB {
    
    public ArrayList<Location> getAllLocations(){
        ArrayList<Location> locationList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from location order by name";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                locationList = new ArrayList();
                Location location;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                    location = new Location();
                    location.setLocationID(rs.getInt("locationID"));
                    location.setLocationName(rs.getString("name"));
                  
                  locationList.add(location);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(LocationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return locationList;
    }
}
