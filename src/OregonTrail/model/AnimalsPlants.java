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
public class AnimalsPlants implements Serializable {

    //class instance variables
    private String animalPlantType;
    private int animalPlantWeight;
    private TrailStopScene trailStopScene;

    public AnimalsPlants() {
    }

    public String getAnimalPlantType() {
        return animalPlantType;
    }

    public void setAnimalPlantType(String animalPlantType) {
        this.animalPlantType = animalPlantType;
    }

    public int getAnimalPlantWeight() {
        return animalPlantWeight;
    }

    public void setAnimalPlantWeight(int animalPlantWeight) {
        this.animalPlantWeight = animalPlantWeight;
    }

    public TrailStopScene getTrailStopScene() {
        return trailStopScene;
    }

    public void setTrailStopScene(TrailStopScene trailStopScene) {
        this.trailStopScene = trailStopScene;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.animalPlantType);
        hash = 13 * hash + this.animalPlantWeight;
        return hash;
    }

    @Override
    public String toString() {
        return "AnimalsPlants{" + "animalPlantType=" + animalPlantType + ", animalPlantWeight=" + animalPlantWeight + '}';
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
        if (this.animalPlantWeight != other.animalPlantWeight) {
            return false;
        }
        if (!Objects.equals(this.animalPlantType, other.animalPlantType)) {
            return false;
        }
        return true;
    }

}
