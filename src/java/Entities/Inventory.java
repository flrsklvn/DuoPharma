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
public class Inventory {
    protected int inventoryID;
    protected String brandName;
    protected String quantityOnHand;
    protected String grandTotal;
    protected String batchNo;
    protected String expDate;
    protected String shelfLife;
    protected String avemonTO;
    protected String inventoryMonths;

    public Inventory() {
    }

    /**
     * @return the inventoryID
     */
    public int getInventoryID() {
        return inventoryID;
    }

    /**
     * @param inventoryID the inventoryID to set
     */
    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the quantityOnHand
     */
    public String getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * @param quantityOnHand the quantityOnHand to set
     */
    public void setQuantityOnHand(String quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    /**
     * @return the grandTotal
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    /**
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     * @return the batchNo
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo the batchNo to set
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * @return the expDate
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * @param expDate the expDate to set
     */
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    /**
     * @return the shelfLife
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * @param shelfLife the shelfLife to set
     */
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    /**
     * @return the avemonTO
     */
    public String getAvemonTO() {
        return avemonTO;
    }

    /**
     * @param avemonTO the avemonTO to set
     */
    public void setAvemonTO(String avemonTO) {
        this.avemonTO = avemonTO;
    }

    /**
     * @return the inventoryMonths
     */
    public String getInventoryMonths() {
        return inventoryMonths;
    }

    /**
     * @param inventoryMonths the inventoryMonths to set
     */
    public void setInventoryMonths(String inventoryMonths) {
        this.inventoryMonths = inventoryMonths;
    }
    
}
