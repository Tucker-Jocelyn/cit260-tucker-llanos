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
public class GeneralStoreScene extends Scene implements Serializable {

    //class instance variables
    private int item;
    private TownScene townScene;
    private FortScene fortScene;
    private ArrayList<InventoryItem> inventoryItems = new ArrayList<>();

    public GeneralStoreScene() {
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public TownScene getTownScene() {
        return townScene;
    }

    public void setTownScene(TownScene townScene) {
        this.townScene = townScene;
    }

    public FortScene getFortScene() {
        return fortScene;
    }

    public void setFortScene(FortScene fortScene) {
        this.fortScene = fortScene;
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.item;
        return hash;
    }

    @Override
    public String toString() {
        return String.format("GeneralStoreScene{%s, item=%d}", super.toString(), item);
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
        final GeneralStoreScene other = (GeneralStoreScene) obj;
        if (this.item != other.item) {
            return false;
        }
        return true;
    }

}
