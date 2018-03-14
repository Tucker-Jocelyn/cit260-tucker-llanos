/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Inventory;
import OregonTrail.model.InventoryItem;
import OregonTrail.model.Item;

/**
 *
 * @author Jocelyn Tucker
 */
public class InventoryControl {

    public static Inventory createInventory() {
        InventoryItem[] types = InventoryItem.values();
        Item[] items = new Item[7];
        for (InventoryItem current : types) {
            items[current.index] = new Item(current);
        }
        Inventory inventory = new Inventory();
        inventory.setInventory(items);
        return inventory;
    }

    public static void calcAddStoreItem(int inventoryType, int inventoryAmount) {
        System.out.println("*** calcAddStoreItem() called ***");
    }

    public static double calcTotalInventoryWeight() {
        double inventoryWeight = 0;
        System.out.println("*** calcTotalInventoryWeight() called ***");
        return inventoryWeight;
    }

}
