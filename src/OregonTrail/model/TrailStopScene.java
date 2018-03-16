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
 * @author kimtllanos
 *
 *
 */
public class TrailStopScene extends Scene implements Serializable {

    private String hasNearbyTown;
    private String nearbyTownName;
    private String hasNearbyFort;
    private String nearbyFortName;
    private int hasAnimal;
    private int hasPlant;

    public TrailStopScene() {
    }

    public String getHasNearbyTown() {
        return hasNearbyTown;
    }

    public void setHasNearbyTown(String hasNearbyTown) {
        this.hasNearbyTown = hasNearbyTown;
    }

    public String getNearbyTownName() {
        return nearbyTownName;
    }

    public void setNearbyTownName(String nearbyTownName) {
        this.nearbyTownName = nearbyTownName;
    }

    public String getHasNearbyFort() {
        return hasNearbyFort;
    }

    public void setHasNearbyFort(String hasNearbyFort) {
        this.hasNearbyFort = hasNearbyFort;
    }

    public String getNearbyFortName() {
        return nearbyFortName;
    }

    public void setNearbyFortName(String nearbyFortName) {
        this.nearbyFortName = nearbyFortName;
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
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.hasNearbyTown);
        hash = 47 * hash + Objects.hashCode(this.nearbyTownName);
        hash = 47 * hash + Objects.hashCode(this.hasNearbyFort);
        hash = 47 * hash + Objects.hashCode(this.nearbyFortName);
        hash = 47 * hash + this.hasAnimal;
        hash = 47 * hash + this.hasPlant;
        return hash;
    }

    @Override
    public String toString() {
        return "TrailStopScene{" + "hasNearbyTown=" + hasNearbyTown + ", nearbyTownName=" + nearbyTownName + ", hasNearbyFort=" + hasNearbyFort + ", nearbyFortName=" + nearbyFortName + ", hasAnimal=" + hasAnimal + ", hasPlant=" + hasPlant + '}';
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
        if (!Objects.equals(this.hasNearbyTown, other.hasNearbyTown)) {
            return false;
        }
        if (!Objects.equals(this.nearbyTownName, other.nearbyTownName)) {
            return false;
        }
        if (!Objects.equals(this.hasNearbyFort, other.hasNearbyFort)) {
            return false;
        }
        if (!Objects.equals(this.nearbyFortName, other.nearbyFortName)) {
            return false;
        }
        return true;
    }

}
