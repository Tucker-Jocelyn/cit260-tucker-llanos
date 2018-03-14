/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kimllanos
 */
public class Location implements Serializable {

    private String name;
    private String description;
    private String scene;
    private ArrayList<Weather> weather = new ArrayList<>();
    private Map map;
    public LocationType type;

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + Objects.hashCode(this.scene);
        hash = 73 * hash + Objects.hashCode(this.weather);
        hash = 73 * hash + Objects.hashCode(this.map);
        hash = 73 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", description=" + description + ", scene=" + scene + ", weather=" + weather + ", map=" + map + ", type=" + type + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

}
