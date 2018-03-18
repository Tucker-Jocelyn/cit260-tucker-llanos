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
 * @author Kim Llanos
 */
public class HotelScene extends Scene implements Serializable {

    private ArrayList<Character> characters = new ArrayList<>();

    public HotelScene(int sceneType, String name, String description) {
        setSceneType(sceneType);
        setName(name);
        setDescription(description);
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.characters);
        return hash;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "characters=" + characters + '}';
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
        final HotelScene other = (HotelScene) obj;
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

}
