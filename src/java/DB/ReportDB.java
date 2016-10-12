/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

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
                  report.setReportType(rs.getString("reportType"));
                  report.setStatus(rs.getString("status"));
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
    
    public boolean addReport(Report report){
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "Insert into `report`(reportType,status) values(?,?)"; //you could include file when we know how to add it.
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,report.getReportType());
                pstmt.setString(2,report.getStatus());
           
           
            int rows = pstmt.executeUpdate();
            
                  
            conn.close();
            return rows == 1;
           } catch (SQLException ex){
               Logger.getLogger(ReportDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        return false;
    }
    
    public int GetLastReport(){
        int lastReport = 1;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select LAST(reportID) from report;";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                
                do{
                  lastReport = rs.getInt("reportID");
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(ReportDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastReport;
    }
    
    public ArrayList<Report> GetAllReportsForValidation(){
        ArrayList<Report> reportsForValidation = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from report where status = 'For Validation';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                 reportsForValidation = new ArrayList();
                Report report;
                do{
                 
                  
                  report = new Report();
                  report.setReportID(rs.getInt("reportID"));
                  report.setReportType(rs.getString("reportType"));
                  report.setStatus(rs.getString("status"));
                  report.setFile(rs.getBlob("file"));
                  
                  reportsForValidation.add(report);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(ReportDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportsForValidation;
    }
    
    public ArrayList<Report> GetAllReportsForApproval(){
        ArrayList<Report> reportsForApproval = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from report where status = 'For Approval';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                 reportsForApproval = new ArrayList();
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
                  report.setReportType(rs.getString("reportType"));
                  report.setStatus(rs.getString("status"));
                  report.setFile(rs.getBlob("file"));
                  
                  reportsForApproval.add(report);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(ReportDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportsForApproval;
    }
}
