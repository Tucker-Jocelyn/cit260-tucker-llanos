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
    private double carryWeight;
    private int length;

    public InventoryWagon() {
    }

    public double getCarryWeight() {
        return carryWeight;
    }

    public void setCarryWeight(double carryWeight) {
        this.carryWeight = carryWeight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.carryWeight) ^ (Double.doubleToLongBits(this.carryWeight) >>> 32));
        hash = 59 * hash + this.length;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryWagon{" + "carryWeight=" + carryWeight + ", length=" + length + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryWagon other = (InventoryWagon) obj;
        if (Double.doubleToLongBits(this.carryWeight) != Double.doubleToLongBits(other.carryWeight)) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        return true;
    }

    
}
