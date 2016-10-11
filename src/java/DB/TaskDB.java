/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Entities.Task;
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
public class TaskDB {
    
    public ArrayList<Task> getAllTasks(){
        ArrayList<Task> taskList = null;
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "select * from task order by taskID";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                taskList = new ArrayList();
                Task task;
                do{
                  /*  account = new Account();
                    account.setAccountID(rs.getInt("accountID"));
                    account.setAgingDays(rs.getInt("agingDays"));
                    account.setDueDate(rs.getString("dueDate"));
                    account.setOpenBalance(rs.getFloat("openBalance"));
                    account.setOrderID(rs.getInt("orderID"));
                    account.setStartDate(rs.getString("startDate")); */
                  
                 task = new Task();
                 task.setTaskID(rs.getInt("taskID"));
                 task.setAction(rs.getString("action"));
                 task.setDueDate(rs.getString("dueDate"));
                 task.setHandledBy(rs.getInt("handledBy"));
                 task.setReportConnected(rs.getInt("reportConnected"));
                 task.setStatus(rs.getString("status"));
                 task.setTaskName(rs.getString("taskName"));
                  
                  
                  taskList.add(task);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(TaskDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return taskList;
    }
    
    public boolean addTask(Task task){
        try{
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection conn = factory.getConnection();
            String query = "Insert into `task`(taskName,dueDate,status,action,reportConnected,HandledBy) values(?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,task.getTaskName());
                pstmt.setString(2,task.getDueDate());
                    pstmt.setString(3,task.getStatus());
                        pstmt.setString(4,task.getAction());
                            pstmt.setInt(5, task.getReportConnected());
                                pstmt.setInt(6, task.getHandledBy());
           
           
            int rows = pstmt.executeUpdate();
            
                  
            conn.close();
            return rows == 1;
           } catch (SQLException ex){
               Logger.getLogger(TaskDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        return false;
    }
}
