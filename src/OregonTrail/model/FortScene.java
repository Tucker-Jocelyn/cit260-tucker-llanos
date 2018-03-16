/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author kimllanos and Jocelyn Tucker
 */
public class FortScene extends Scene implements Serializable {

    public Places placeName;

    private GeneralStoreScene generalStoreScene;

    public FortScene(int sceneType, String description) {
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
        hash = 29 * hash + Objects.hashCode(this.placeName);
        hash = 29 * hash + Objects.hashCode(this.generalStoreScene);
        return hash;
    }

    @Override
    public String toString() {
        return "FortScene{" + "placeName=" + placeName + ", generalStoreScene=" + generalStoreScene + '}';
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
        final FortScene other = (FortScene) obj;
        if (this.placeName != other.placeName) {
            return false;
        }
        if (!Objects.equals(this.generalStoreScene, other.generalStoreScene)) {
            return false;
        }
        return true;
    }

}
