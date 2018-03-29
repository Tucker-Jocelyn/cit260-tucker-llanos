
package OregonTrail.model;

/**
 *
 * @author Jocelyn Tucker
 */
public enum InventoryItem {

    FOOD(0, "Food", 1, "5 pounds of food per person per day is suggested.", 0.20),
    WHEEL(1, "Spare Wagon Wheel", 10, "Spare wheel for the wagon.", 10),
    AMMO(2, "Bullets", 1, "Each box contains 20 bullets. Amount is the number of total bullets", 2);

    //class instance variables
    public final int index;
    public final String inventoryName;
    public final int itemWeight;
    public final String inventoryDescription;
    public final double inventoryCost;

    InventoryItem(int index, String inventoryName, int itemWeight, String inventoryDescription, double inventoryCost) {
        this.index = index;
        this.inventoryName = inventoryName;
        this.itemWeight = itemWeight;
        this.inventoryDescription = inventoryDescription;
        this.inventoryCost = inventoryCost;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "index=" + index + ", inventoryType=" + inventoryName + ", itemWeight=" + itemWeight + ", inventoryDescription=" + inventoryDescription + ", inventoryCost=" + inventoryCost + '}';
    }

}
