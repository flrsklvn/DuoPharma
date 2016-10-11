/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

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
public class SalesDB {
    
    public ArrayList<Sales> getAllSalesReports(){
        ArrayList<Sales> salesList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from sales order by salesID";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                salesList = new ArrayList();
                Sales sales;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                  
                  sales = new Sales();
                  sales.setSalesID(rs.getInt("salesID"));
                  sales.setSalesAmmount(rs.getFloat("salesAmmount"));
                  sales.setLocation(rs.getInt("location"));
                  sales.setCreatedBy(rs.getInt("createdBy"));
                  sales.setReportRef(rs.getInt("reportRef"));
                          
                  salesList.add(sales);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(SalesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salesList;
    }
    
    public boolean addSales(Sales sales){
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "Insert into sales(salesAmmount,createdBy,location,ReportRef) values(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1,sales.getSalesAmmount());
                pstmt.setInt(2,sales.getCreatedBy());
                    pstmt.setInt(3,sales.getLocation());
                    pstmt.setInt(4,sales.getReportRef());

            int rows = pstmt.executeUpdate();
            
                  
            conn.close();
            return rows == 1;
           } catch (SQLException ex){
               Logger.getLogger(CustomerDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        return false;
    }
    
    
}
