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
public enum Weather {

    HOT("Heat wave", 2),
    CLOUDS("Overcast", 0),
    SUN("Sunny", 0),
    RAIN("Raining", 1),
    SNOW("Snowing", 2);

    public final String type;
    public final int value;

    Weather(String type, int value) {
        this.type = type;
        this.value = value;

    }
}
