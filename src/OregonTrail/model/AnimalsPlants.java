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
public enum AnimalsPlants {

    //class instance variables
    ANIMAL(15),
    PLANT(5);

    public final int weight;

    AnimalsPlants(int weight) {
        this.weight = weight;
    }
}
