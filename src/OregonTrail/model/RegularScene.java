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

    public RegularScene(int sceneType, String description) {
        setSceneType(sceneType);
        setDescription(description);
    }

    public Places getPlaceName() {
        return placeName;
    }

    public void setPlaceName(Places placeName) {
        this.placeName = placeName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.placeName);
        return hash;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "placeName=" + placeName + '}';
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
        if (this.placeName != other.placeName) {
            return false;
        }
        return true;
    }

}
