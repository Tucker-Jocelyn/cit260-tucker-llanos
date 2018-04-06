package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jocelyn Tucker
 */
public class Wagon implements Serializable {

    //class instance variables
    private double maxCarryWeight;
    private int length;
    private double wagonWeight;
    private Inventory inventory;
    private double animalWeight;
    private double plantWeight;

    public Wagon() {
    }

    public double getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public void setMaxCarryWeight(double maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWagonWeight() {
        return wagonWeight;
    }

    public void setWagonWeight(double wagonWeight) {
        this.wagonWeight = wagonWeight;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public double getPlantWeight() {
        return plantWeight;
    }

    public void setPlantWeight(double plantWeight) {
        this.plantWeight = plantWeight;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.maxCarryWeight) ^ (Double.doubleToLongBits(this.maxCarryWeight) >>> 32));
        hash = 43 * hash + this.length;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.wagonWeight) ^ (Double.doubleToLongBits(this.wagonWeight) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.inventory);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.animalWeight) ^ (Double.doubleToLongBits(this.animalWeight) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.plantWeight) ^ (Double.doubleToLongBits(this.plantWeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Wagon{" + "maxCarryWeight=" + maxCarryWeight + ", length=" + length + ", wagonWeight=" + wagonWeight + ", inventory=" + inventory + ", animalWeight=" + animalWeight + ", plantWeight=" + plantWeight + '}';
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
        final Wagon other = (Wagon) obj;
        if (Double.doubleToLongBits(this.maxCarryWeight) != Double.doubleToLongBits(other.maxCarryWeight)) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (Double.doubleToLongBits(this.wagonWeight) != Double.doubleToLongBits(other.wagonWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.animalWeight) != Double.doubleToLongBits(other.animalWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.plantWeight) != Double.doubleToLongBits(other.plantWeight)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

    

}
