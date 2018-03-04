/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jocelyn Tucker
 */
public class Item implements Serializable {

    public InventoryItem type;
    private int inventoryAmount;

    public Item(InventoryItem type) {
        this.type = type;
        this.inventoryAmount = 0;
    }

    public InventoryItem getType() {
        return type;
    }

    public void setType(InventoryItem type) {
        this.type = type;
    }

    public int getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(int inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.type);
        hash = 71 * hash + this.inventoryAmount;
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "type=" + type + ", inventoryAmount=" + inventoryAmount + '}';
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
        final Item other = (Item) obj;
        if (this.inventoryAmount != other.inventoryAmount) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

}
