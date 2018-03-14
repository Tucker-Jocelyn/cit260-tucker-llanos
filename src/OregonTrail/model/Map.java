/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author kimllanos
 */
public class Map implements Serializable {

    private String currentLocation;
    private double milePost;
    private Game game;
    private ArrayList<Location> locations = new ArrayList<>();

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

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.currentLocation);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.milePost) ^ (Double.doubleToLongBits(this.milePost) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.game);
        hash = 53 * hash + Objects.hashCode(this.locations);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + ", milePost=" + milePost + ", game=" + game + ", locations=" + locations + '}';
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
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

}
