
package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jocelyn Tucker
 */
public class Money implements Serializable {

    //class instance variables
    private double teamTotal;
    private ArrayList<InventoryItem> inventoryItems = new ArrayList<>();
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
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.teamTotal) ^ (Double.doubleToLongBits(this.teamTotal) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.inventoryItems);
        hash = 17 * hash + Objects.hashCode(this.characters);
        return hash;
    }

    @Override
    public String toString() {
        return "Money{" + "teamTotal=" + teamTotal + ", inventoryItems=" + inventoryItems + ", characters=" + characters + '}';
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
        if (!Objects.equals(this.inventoryItems, other.inventoryItems)) {
            return false;
        }
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

    

}
