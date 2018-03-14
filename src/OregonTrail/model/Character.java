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
public class Character implements Serializable {

    private String characterName;
    private int stamina;
    private int characterHuntingSkill;
    private int characterGatheringSkill;
    private boolean availability;
    private double characterHealth;
    private double money;
    private double characterFood;
    private ArrayList<Character> characters = new ArrayList<>();

    public Character() {
    }

    public Character(String characterName, int stamina, int characterHuntingSkill, int characterGatheringSkill, boolean availability, double characterHealth, double money, double characterFood) {
        this.characterName = characterName;
        this.stamina = stamina;
        this.characterHuntingSkill = characterHuntingSkill;
        this.characterGatheringSkill = characterGatheringSkill;
        this.availability = availability;
        this.characterHealth = characterHealth;
        this.money = money;
        this.characterFood = characterFood;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCharacterHuntingSkill() {
        return characterHuntingSkill;
    }

    public void setCharacterHuntingSkill(int characterHuntingSkill) {
        this.characterHuntingSkill = characterHuntingSkill;
    }

    public int getCharacterGatheringSkill() {
        return characterGatheringSkill;
    }

    public void setCharacterGatheringSkill(int characterGatheringSkill) {
        this.characterGatheringSkill = characterGatheringSkill;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getCharacterFood() {
        return characterFood;
    }

    public void setCharacterFood(double characterFood) {
        this.characterFood = characterFood;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.characterName);
        hash = 37 * hash + this.stamina;
        hash = 37 * hash + this.characterHuntingSkill;
        hash = 37 * hash + this.characterGatheringSkill;
        hash = 37 * hash + (this.availability ? 1 : 0);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.characterHealth) ^ (Double.doubleToLongBits(this.characterHealth) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.characterFood) ^ (Double.doubleToLongBits(this.characterFood) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.characters);
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "characterName=" + characterName + ", stamina=" + stamina + ", characterHuntingSkill=" + characterHuntingSkill + ", characterGatheringSkill=" + characterGatheringSkill + ", availability=" + availability + ", characterHealth=" + characterHealth + ", money=" + money + ", characterFood=" + characterFood + ", characters=" + characters + '}';
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
        if (this.stamina != other.stamina) {
            return false;
        }
        if (this.characterHuntingSkill != other.characterHuntingSkill) {
            return false;
        }
        if (this.characterGatheringSkill != other.characterGatheringSkill) {
            return false;
        }
        if (this.availability != other.availability) {
            return false;
        }
        if (Double.doubleToLongBits(this.characterHealth) != Double.doubleToLongBits(other.characterHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (Double.doubleToLongBits(this.characterFood) != Double.doubleToLongBits(other.characterFood)) {
            return false;
        }
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }


}
