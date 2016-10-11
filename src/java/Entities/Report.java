/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Blob;

/**
 *
 * @author Myron-Laptop
 */
public class Report {
    
    protected int reportID;
    protected String reportType;
    protected String status;
    protected Blob file;

    public Report() {
    }

    public Report(String reportType, String status) {
        this.reportType = reportType;
        this.status = status;
    }
    
    

    /**
     * @return the reportID
     */
    public int getReportID() {
        return reportID;
    }

    /**
     * @param reportID the reportID to set
     */
    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    /**
     * @return the reportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * @param reportType the reportType to set
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
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
     * @return the file
     */
    public Blob getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(Blob file) {
        this.file = file;
    }

    
}
