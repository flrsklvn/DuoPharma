/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Entities.Accounting;
import Entities.Report;
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
public class AccountingDB {
    
    public ArrayList<Accounting> getAllAccountReports(){
        ArrayList<Accounting> reportList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from report order by reportID";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                reportList = new ArrayList();
                Accounting report;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                  
                  report = new Accounting();
                  report.setAccountingID(rs.getInt("accountingID"));
                  report.setAgingDays(rs.getString("agingDays"));
                  report.setCustomerID(rs.getInt("customerID"));
                  report.setDueDate(rs.getString("dueDate"));
                  report.setPoNo(rs.getString("poNo"));
                  report.setStartDate(rs.getString("startDate"));
                  report.setTerms(rs.getString("terms"));
                  report.setReportRef(rs.getInt("reportRef"));
                  
                  reportList.add(report);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(AccountingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportList;
    }
}
