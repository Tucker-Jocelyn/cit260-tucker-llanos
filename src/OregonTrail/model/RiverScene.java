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
 * @author kimllanos and Jocelyn Tucker
 */
public class RiverScene extends Scene implements Serializable {

    private double waterDepth;
    public Places placeName;
    private String mapSymbol;

    public RiverScene(int sceneType, String name, String description, double waterDepth) {
        setSceneType(sceneType);
        setName(name);
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

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.waterDepth) ^ (Double.doubleToLongBits(this.waterDepth) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.placeName);
        hash = 67 * hash + Objects.hashCode(this.mapSymbol);
        return hash;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "waterDepth=" + waterDepth + ", placeName=" + placeName + ", mapSymbol=" + mapSymbol + '}';
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
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.placeName != other.placeName) {
            return false;
        }
        return true;
    }

}
