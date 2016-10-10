/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITIES;

/**
 *
 * @author Myron-Laptop
 */
public class Accounting {
    protected int accountingID;
    protected String startDate;
    protected String poNo;
    protected String terms;
    protected String dueDate;
    protected String agingDays;
    protected int customerID;

    public Accounting() {
    }
    
    /**
     * @return the accountingID
     */
    public int getAccountingID() {
        return accountingID;
    }

    /**
     * @param accountingID the accountingID to set
     */
    public void setAccountingID(int accountingID) {
        this.accountingID = accountingID;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the poNo
     */
    public String getPoNo() {
        return poNo;
    }

    /**
     * @param poNo the poNo to set
     */
    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    /**
     * @return the terms
     */
    public String getTerms() {
        return terms;
    }

    /**
     * @param terms the terms to set
     */
    public void setTerms(String terms) {
        this.terms = terms;
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
     * @return the agingDays
     */
    public String getAgingDays() {
        return agingDays;
    }

    /**
     * @param agingDays the agingDays to set
     */
    public void setAgingDays(String agingDays) {
        this.agingDays = agingDays;
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
