package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kimllanos and Jocelyn Tucker
 */
public class RiverScene extends Scene implements Serializable {

    private double waterDepth;
    public Places placeName;

    public RiverScene(int sceneType, String description, double waterDepth) {
        setSceneType(sceneType);
        setDescription(description);
        setWaterDepth(waterDepth);
    }

    public double getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(double waterDepth) {
        this.waterDepth = waterDepth;
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
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.waterDepth) ^ (Double.doubleToLongBits(this.waterDepth) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.placeName);
        return hash;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "waterDepth=" + waterDepth + ", placeName=" + placeName + '}';
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
        final RiverScene other = (RiverScene) obj;
        if (Double.doubleToLongBits(this.waterDepth) != Double.doubleToLongBits(other.waterDepth)) {
            return false;
        }
        if (this.placeName != other.placeName) {
            return false;
        }
        return true;
    }

}
