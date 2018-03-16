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
 * @author kimllanos and Jocelyn Tucker
 *
 */
public class Character implements Serializable {

    public CharacterDefinitions characterName;
    private boolean availability;
    private double characterHealth;
    private double characterFood;

    public Character(CharacterDefinitions dfn) {
        this.characterName = dfn;
        this.availability = true;
        this.characterHealth = 100;
        this.characterFood = dfn.stamina;
    }

    public CharacterDefinitions getCharacterName() {
        return characterName;
    }

    public void setCharacterName(CharacterDefinitions characterName) {
        this.characterName = characterName;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getCharacterHealth() {
        return characterHealth;
    }

    public void setCharacterHealth(double characterHealth) {
        this.characterHealth = characterHealth;
    }

    public double getCharacterFood() {
        return characterFood;
    }

    public void setCharacterFood(double characterFood) {
        this.characterFood = characterFood;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.characterName);
        hash = 41 * hash + (this.availability ? 1 : 0);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.characterHealth) ^ (Double.doubleToLongBits(this.characterHealth) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.characterFood) ^ (Double.doubleToLongBits(this.characterFood) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "characterName=" + characterName + ", availability=" + availability + ", characterHealth=" + characterHealth + ", characterFood=" + characterFood + '}';
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
        final Character other = (Character) obj;
        if (this.availability != other.availability) {
            return false;
        }
        if (Double.doubleToLongBits(this.characterHealth) != Double.doubleToLongBits(other.characterHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.characterFood) != Double.doubleToLongBits(other.characterFood)) {
            return false;
        }
        if (this.characterName != other.characterName) {
            return false;
        }
        return true;
    }

}

/* private String characterName;
    private int stamina;
    private int characterHuntingSkill;
    private int characterGatheringSkill;
    private boolean availability;
    private double characterHealth;
    private double characterFood;
    private Team team;

    public Character() {
    }

    public Character(String characterName, int stamina, int characterHuntingSkill, int characterGatheringSkill, boolean availability, double characterHealth, double characterFood) {
        this.characterName = characterName;
        this.stamina = stamina;
        this.characterHuntingSkill = characterHuntingSkill;
        this.characterGatheringSkill = characterGatheringSkill;
        this.availability = availability;
        this.characterHealth = characterHealth;
        this.characterFood = characterFood;
    }
*/
