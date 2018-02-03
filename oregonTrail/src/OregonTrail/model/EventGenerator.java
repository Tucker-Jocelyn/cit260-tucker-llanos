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
public class EventGenerator implements Serializable{
    
    //class instance variables
    private int event;
    private String character;

    public EventGenerator() {
    }
        
    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.event;
        hash = 67 * hash + Objects.hashCode(this.character);
        return hash;
    }

    @Override
    public String toString() {
        return "EventGenerator{" + "event=" + event + ", character=" + character + '}';
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
        final EventGenerator other = (EventGenerator) obj;
        if (this.event != other.event) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return true;
    }

    
}
