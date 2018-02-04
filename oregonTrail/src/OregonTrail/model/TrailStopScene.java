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
public class TrailStopScene implements Serializable{
    private String hasNearbyTown;
    private String nearbyTownName;
    private String hasNearbyFort;
    private String nearbyFortName;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.hasNearbyTown);
        hash = 71 * hash + Objects.hashCode(this.nearbyTownName);
        hash = 71 * hash + Objects.hashCode(this.hasNearbyFort);
        hash = 71 * hash + Objects.hashCode(this.nearbyFortName);
        return hash;
    }

    @Override
    public String toString() {
        return "TrailStopScene{" + "hasNearbyTown=" + hasNearbyTown + ", nearbyTownName=" + nearbyTownName + ", hasNearbyFort=" + hasNearbyFort + ", nearbyFortName=" + nearbyFortName + '}';
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
