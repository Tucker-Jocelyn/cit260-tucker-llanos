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
 * @author Jocelyn Tucker
 */
public class Weather implements Serializable {

    //class instance variables
    private String weatherType;
    private int weatherValue;
    private ArrayList<Location> locations = new ArrayList<>();

    public Weather() {
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public int getWeatherValue() {
        return weatherValue;
    }

    public void setWeatherValue(int weatherValue) {
        this.weatherValue = weatherValue;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.weatherType);
        hash = 67 * hash + this.weatherValue;
        return hash;
    }

    @Override
    public String toString() {
        return "Weather{" + "weatherType=" + weatherType + ", weatherValue=" + weatherValue + '}';
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
        final Weather other = (Weather) obj;
        if (this.weatherValue != other.weatherValue) {
            return false;
        }
        if (!Objects.equals(this.weatherType, other.weatherType)) {
            return false;
        }
        return true;
    }

}
