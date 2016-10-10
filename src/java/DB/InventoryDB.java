    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import ENTITIES.Inventory;
import ENTITIES.User;
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
public class InventoryDB {
    
    public ArrayList<Inventory> getAllInventoryReports(){
        ArrayList<Inventory> inventoryList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from inventory order by inventoryID";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                inventoryList = new ArrayList();
                Inventory inventory;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                  
                  inventory = new Inventory();
                  inventory.setInventoryID(rs.getInt("inventoryID"));
                  inventory.setAvemonTO(rs.getString("avemonTO"));
                  inventory.setBatchNo(rs.getString("batchNo"));
                  inventory.setBrandName(rs.getString("brandName"));
                  inventory.setExpDate(rs.getString("expDate"));
                  inventory.setGrandTotal(rs.getString("grandTotal"));
                  inventory.setInventoryMonths(rs.getString("inventoryMonths"));
                  inventory.setQuantityOnHand(rs.getString("quantityOnHand"));
                  inventory.setShelfLife(rs.getString("shelfLife"));
                  
                  inventoryList.add(inventory);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(InventoryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inventoryList;
    }
}
