package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kimllanos and Jocelyn Tucker
 */
public class TownScene extends Scene implements Serializable {

    public Places placeName;
    private String mapSymbol;
    private GeneralStoreScene generalStoreScene;

    public TownScene(int sceneType, String description) {
        setSceneType(sceneType);
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
        hash = 89 * hash + Objects.hashCode(this.placeName);
        hash = 89 * hash + Objects.hashCode(this.mapSymbol);
        hash = 89 * hash + Objects.hashCode(this.generalStoreScene);
        return hash;
    }

    @Override
    public String toString() {
        return "TownScene{" + "placeName=" + placeName + ", mapSymbol=" + mapSymbol + ", generalStoreScene=" + generalStoreScene + '}';
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
        final TownScene other = (TownScene) obj;
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.placeName != other.placeName) {
            return false;
        }
        if (!Objects.equals(this.generalStoreScene, other.generalStoreScene)) {
            return false;
        }
        return true;
    }

}
