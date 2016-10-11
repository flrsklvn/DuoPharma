    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Entities.Inventory;
import Entities.Sales;
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
                  inventory.setAvemonTO(rs.getDouble("avemonTO"));
                  inventory.setBatchNo(rs.getInt("batchNo"));
                  inventory.setBrandName(rs.getString("brandName"));
                  inventory.setExpDate(rs.getString("expDate"));
                  inventory.setGrandTotal(rs.getInt("grandTotal"));
                  inventory.setInventoryMonths(rs.getString("inventoryMonths"));
                  inventory.setQuantityOnHand(rs.getInt("quantityOnHand"));
                  inventory.setShelfLife(rs.getString("shelfLife"));
                  inventory.setReportRef(rs.getInt("reportRef"));
                  
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
    
    public boolean addInventory(Inventory inventory){
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "Insert into inventory(brandName,quantityOnHand,grandTotal,batchNo,expDate,shelfLife,avemonTO,inventoryMonths,reportRef) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,inventory.getBrandName());
            pstmt.setInt(2,inventory.getQuantityOnHand());
            pstmt.setInt(3,inventory.getGrandTotal());
            pstmt.setInt(4,inventory.getBatchNo());
            pstmt.setString(5,inventory.getExpDate());
            pstmt.setString(6,inventory.getShelfLife());
            pstmt.setDouble(7,inventory.getAvemonTO());
            pstmt.setString(8,inventory.getInventoryMonths());
            pstmt.setInt(9, inventory.getReportRef());

           
           
            int rows = pstmt.executeUpdate();
            
                  
            conn.close();
            return rows == 1;
           } catch (SQLException ex){
               Logger.getLogger(CustomerDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        return false;
    }
}
