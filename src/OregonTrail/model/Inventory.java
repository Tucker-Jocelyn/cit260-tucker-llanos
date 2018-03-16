package OregonTrail.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Jocelyn Tucker
 */
public class Inventory implements Serializable {

    private Item[] inventory = new Item[3];

    public Inventory() {
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.inventory);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventory=" + inventory + '}';
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
        final Inventory other = (Inventory) obj;
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

}
