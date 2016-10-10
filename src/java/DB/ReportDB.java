/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import ENTITIES.Report;
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
public class ReportDB {
    public ArrayList<Report> getAllReports(){
        ArrayList<Report> reportList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from report order by reportID";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                reportList = new ArrayList();
                Report report;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                  
                  report = new Report();
                  report.setReportID(rs.getInt("reportID"));
                  report.setReportRef(rs.getInt("reportRef"));
                  report.setReportType(rs.getString("reportType"));
                  report.setStatus(rs.getString("staus"));
                  report.setFile(rs.getBlob("file"));
                  
                  reportList.add(report);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(ReportDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportList;
    }
}
