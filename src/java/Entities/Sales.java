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
public class Sales {
    protected int salesID;
    protected float salesAmmount;
    protected int createdBy;
    protected int location;

    public Sales() {
    }
    

    /**
     * @return the salesID
     */
    public int getSalesID() {
        return salesID;
    }

    /**
     * @param salesID the salesID to set
     */
    public void setSalesID(int salesID) {
        this.salesID = salesID;
    }

    /**
     * @return the salesAmmount
     */
    public float getSalesAmmount() {
        return salesAmmount;
    }

    /**
     * @param salesAmmount the salesAmmount to set
     */
    public void setSalesAmmount(float salesAmmount) {
        this.salesAmmount = salesAmmount;
    }

    /**
     * @return the createdBy
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the location
     */
    public int getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(int location) {
        this.location = location;
    }
}
