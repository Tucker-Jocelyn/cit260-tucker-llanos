package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author kimllanos
 */
public class Map implements Serializable {

    private String currentLocation;
    private double milePost;
    private Location[] locations = new Location[81];

    public Map() {
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;

    }

    public double getMilePost() {
        return milePost;
    }

    public void setMilePost(double milePost) {
        this.milePost = milePost;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.currentLocation);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.milePost) ^ (Double.doubleToLongBits(this.milePost) >>> 32));
        hash = 37 * hash + Arrays.deepHashCode(this.locations);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + ", milePost=" + milePost + ", locations=" + locations + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.milePost) != Double.doubleToLongBits(other.milePost)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

}
