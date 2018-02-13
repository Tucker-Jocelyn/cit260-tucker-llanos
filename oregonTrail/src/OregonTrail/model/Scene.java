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
 * @author kimllanos
 */
public class Scene implements Serializable{
    private int sceneType;
    private String name;
    private String description;
    private String landmarkName;
    private int hasAnimal;
    private int hasPlant;
    private Location location;

    public Scene() {
    }
    
    

    public int getSceneType() {
        return sceneType;
    }

    public void setSceneType(int sceneType) {
        this.sceneType = sceneType;
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

    public String getLandmarkName() {
        return landmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        this.landmarkName = landmarkName;
    }

    public int getHasAnimal() {
        return hasAnimal;
    }

    public void setHasAnimal(int hasAnimal) {
        this.hasAnimal = hasAnimal;
    }

    public int getHasPlant() {
        return hasPlant;
    }

    public void setHasPlant(int hasPlant) {
        this.hasPlant = hasPlant;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.sceneType;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.landmarkName);
        hash = 29 * hash + this.hasAnimal;
        hash = 29 * hash + this.hasPlant;
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneType=" + sceneType + ", name=" + name + ", description=" + description + ", landmarkName=" + landmarkName + ", hasAnimal=" + hasAnimal + ", hasPlant=" + hasPlant + '}';
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
        final Scene other = (Scene) obj;
        if (this.sceneType != other.sceneType) {
            return false;
        }
        if (this.hasAnimal != other.hasAnimal) {
            return false;
        }
        if (this.hasPlant != other.hasPlant) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.landmarkName, other.landmarkName)) {
            return false;
        }
        return true;
    }


}
