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
public class InventoryItem implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private int inventoryAmount;
    private int itemWeight;
    private String inventoryDescription;
    private double inventoryCost;
    private Money money;
    private Game game;
    private GeneralStoreScene generalStoreScene;

    public InventoryItem() {
    }
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(int inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getInventoryDescription() {
        return inventoryDescription;
    }

    public void setInventoryDescription(String inventoryDescription) {
        this.inventoryDescription = inventoryDescription;
    }

    public double getInventoryCost() {
        return inventoryCost;
    }

    public void setInventoryCost(double inventoryCost) {
        this.inventoryCost = inventoryCost;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    public GeneralStoreScene getGeneralStoreScene() {
        return generalStoreScene;
    }

    public void setGeneralStoreScene(GeneralStoreScene generalStoreScene) {
        this.generalStoreScene = generalStoreScene;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.inventoryType);
        hash = 59 * hash + this.inventoryAmount;
        hash = 59 * hash + this.itemWeight;
        hash = 59 * hash + Objects.hashCode(this.inventoryDescription);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.inventoryCost) ^ (Double.doubleToLongBits(this.inventoryCost) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", inventoryAmount=" + inventoryAmount + ", itemWeight=" + itemWeight + ", inventoryDescription=" + inventoryDescription + ", inventoryCost=" + inventoryCost + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.inventoryAmount != other.inventoryAmount) {
            return false;
        }
        if (this.itemWeight != other.itemWeight) {
            return false;
        }
        if (Double.doubleToLongBits(this.inventoryCost) != Double.doubleToLongBits(other.inventoryCost)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.inventoryDescription, other.inventoryDescription)) {
            return false;
        }
        return true;
    }
    
   
}
