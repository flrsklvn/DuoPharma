/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Myron-Laptop
 */
public class Task {
    
    protected int taskID;
    protected String taskName;
    protected String dueDate;
    protected String status;
    protected String action;
    protected int reportConnected;
    protected int HandledBy;

    public Task() {
    }
    
    /**
     * @return the taskID
     */
    public int getTaskID() {
        return taskID;
    }

    /**
     * @param taskID the taskID to set
     */
    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the reportConnected
     */
    public int getReportConnected() {
        return reportConnected;
    }

    /**
     * @param reportConnected the reportConnected to set
     */
    public void setReportConnected(int reportConnected) {
        this.reportConnected = reportConnected;
    }

    /**
     * @return the HandledBy
     */
    public int getHandledBy() {
        return HandledBy;
    }

    /**
     * @param HandledBy the HandledBy to set
     */
    public void setHandledBy(int HandledBy) {
        this.HandledBy = HandledBy;
    }
    
}
