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
 * @author kimta and Jocelyn Tucker
 */
public class RegularScene extends Scene implements Serializable {

    public Places placeName;
    private String mapSymbol;

    public RegularScene(int sceneType, String name, String description) {
        setSceneType(sceneType);
        setName(name);
        setDescription(description);
    }

    public Places getPlaceName() {
        return placeName;
    }

    public void setPlaceName(Places placeName) {
        this.placeName = placeName;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.placeName);
        hash = 79 * hash + Objects.hashCode(this.mapSymbol);
        return hash;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "placeName=" + placeName + ", mapSymbol=" + mapSymbol + '}';
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.placeName != other.placeName) {
            return false;
        }
        return true;
    }

}
