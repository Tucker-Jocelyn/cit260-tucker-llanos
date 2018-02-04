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
 * @author Jocelyn Tucker
 */
public class AnimalsPlants implements Serializable{
    
    //class instance variables
    private String type;
    private int weight;
    private TrailStopScene trailStopScene;

    public AnimalsPlants() {
    }
        
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public TrailStopScene getTrailStopScene() {
        return trailStopScene;
    }

    public void setTrailStopScene(TrailStopScene trailStopScene) {
        this.trailStopScene = trailStopScene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + this.weight;
        return hash;
    }

    @Override
    public String toString() {
        return "AnimalsPlants{" + "type=" + type + ", weight=" + weight + '}';
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
        final AnimalsPlants other = (AnimalsPlants) obj;
        if (this.weight != other.weight) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
  
}
