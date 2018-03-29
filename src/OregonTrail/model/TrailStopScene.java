package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kimtllanos
 *
 *
 */
public class TrailStopScene extends Scene implements Serializable {

//    private String hasNearbyTown;
    //private String nearbyTownName;
    //private String hasNearbyFort;
    //private String nearbyFortName;
    private int hasAnimal;
    private int hasPlant;

    public TrailStopScene(int sceneType, String name, String description, int hasAnimal, int hasPlant) {
    }

    public int getHasAnimal() {
        return hasAnimal;
    }

    public void setHasAnimal(int hasAnimal) {
        this.hasAnimal = hasAnimal;
    }

    public int getHasPlant() {
        return hasPlant;
    }

    public void setHasPlant(int hasPlant) {
        this.hasPlant = hasPlant;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.hasAnimal;
        hash = 31 * hash + this.hasPlant;
        return hash;
    }

    @Override
    public String toString() {
        return "TrailStopScene{" + "hasAnimal=" + hasAnimal + ", hasPlant=" + hasPlant + '}';
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
        final TrailStopScene other = (TrailStopScene) obj;
        if (this.hasAnimal != other.hasAnimal) {
            return false;
        }
        if (this.hasPlant != other.hasPlant) {
            return false;
        }
        return true;
    }

}
