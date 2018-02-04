/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jocelyn Tucker
 */
public class Money implements Serializable{
    
    //class instance variables
    private double teamTotal;
    private ArrayList<InventoryItem> inventoryItems = new ArrayList <>();
    private ArrayList<Character> characters = new ArrayList<>();
    

    public Money() {
    }
        
    public double getTeamTotal() {
        return teamTotal;
    }

    public void setTeamTotal(double teamTotal) {
        this.teamTotal = teamTotal;
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.teamTotal) ^ (Double.doubleToLongBits(this.teamTotal) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Money{" + "teamTotal=" + teamTotal + '}';
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
        final Money other = (Money) obj;
        if (Double.doubleToLongBits(this.teamTotal) != Double.doubleToLongBits(other.teamTotal)) {
            return false;
        }
        return true;
    }
    
    
}
