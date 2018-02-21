/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author Jocelyn Tucker
 */
public class InventoryWagon extends InventoryItem implements Serializable{
    
    //class instance variables
    private double maxCarryWeight;
    private int length;
    private double wagonWeight;

    public InventoryWagon() {
    }

    public double getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public void setMaxCarryWeight(double maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWagonWeight() {
        return wagonWeight;
    }

    public void setWagonWeight(double wagonWeight) {
        this.wagonWeight = wagonWeight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.maxCarryWeight) ^ (Double.doubleToLongBits(this.maxCarryWeight) >>> 32));
        hash = 17 * hash + this.length;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.wagonWeight) ^ (Double.doubleToLongBits(this.wagonWeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        //return "InventoryWagon{" + "maxCarryWeight=" + maxCarryWeight + ", length=" + length + ", wagonWeight=" + wagonWeight + '}';
        return String.format("InventoryWagon{%s, maxCarryWeight=%s, length=%d, wagonWeight=%s}", super.toString(), maxCarryWeight, length, wagonWeight);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) == false) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryWagon other = (InventoryWagon) obj;
        if (Double.doubleToLongBits(this.maxCarryWeight) != Double.doubleToLongBits(other.maxCarryWeight)) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (Double.doubleToLongBits(this.wagonWeight) != Double.doubleToLongBits(other.wagonWeight)) {
            return false;
        }
        return true;
    }

    
}
