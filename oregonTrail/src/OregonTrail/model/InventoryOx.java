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
public class InventoryOx extends InventoryItem implements Serializable{
    
    //class instance variables
    private int position;
    private double pullWeight;
    private int oxHealth;

    public InventoryOx() {
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getPullWeight() {
        return pullWeight;
    }

    public void setPullWeight(double pullWeight) {
        this.pullWeight = pullWeight;
    }

    public int getOxHealth() {
        return oxHealth;
    }

    public void setOxHealth(int oxHealth) {
        this.oxHealth = oxHealth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.position;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.pullWeight) ^ (Double.doubleToLongBits(this.pullWeight) >>> 32));
        hash = 79 * hash + this.oxHealth;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryOx{" + "position=" + position + ", pullWeight=" + pullWeight + ", oxHealth=" + oxHealth + '}';
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
        final InventoryOx other = (InventoryOx) obj;
        if (this.position != other.position) {
            return false;
        }
        if (Double.doubleToLongBits(this.pullWeight) != Double.doubleToLongBits(other.pullWeight)) {
            return false;
        }
        if (this.oxHealth != other.oxHealth) {
            return false;
        }
        return true;
    }
    
    
}
