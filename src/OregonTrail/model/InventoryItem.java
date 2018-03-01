/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

/**
 *
 * @author Jocelyn Tucker
 */
public enum InventoryItem {

    OX(0, "Oxen", 0, "A single ox can pull 550 lbs.", 20),
    SMALL_WAGON(1, "Small Wagon", 1250, "A small wagon weighs 1250 lbs and can carry 1800 lbs of supplies.", 60),
    MEDIUM_WAGON(2, "Medium Wagon", 1300, "A medium wagon weighs 1300 lbs and can carry 2000 lbs of supplies.", 70),
    LARGE_WAGON(3, "Large Wagon", 1350, "A large wagon weighs 1350 lbs and can carry 2200 lbs of supplies.", 80),
    FOOD(5, "Food", 1, "5 pounds of food per person per day is suggested.", 0.20),
    WHEEL(6, "Spare Wagon Wheel", 10, "Spare wheel for the wagon.", 10),
    AMMO(7, "Bullets", 1, "Each box contains 20 bullets. Amount is the number of total bullets", 2);

    //class instance variables
    public int index;
    public String inventoryName;
    public int itemWeight;
    public String inventoryDescription;
    public double inventoryCost;

    InventoryItem(int index, String inventoryName, int itemWeight, String inventoryDescription, double inventoryCost) {
        this.index = index;
        this.inventoryName = inventoryName;
        this.itemWeight = itemWeight;
        this.inventoryDescription = inventoryDescription;
        this.inventoryCost = inventoryCost;
    }

    public int getIndex() {
        return index;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public String getInventoryDescription() {
        return inventoryDescription;
    }

    public double getInventoryCost() {
        return inventoryCost;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "index=" + index + ", inventoryType=" + inventoryName + ", itemWeight=" + itemWeight + ", inventoryDescription=" + inventoryDescription + ", inventoryCost=" + inventoryCost + '}';
    }

    
}

/*public class InventoryItem implements Serializable{

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
*/
