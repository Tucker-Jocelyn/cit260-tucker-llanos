
package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jocelyn Tucker
 */
public class EventGenerator implements Serializable {

    //class instance variables
    private int event;
    private String character;
    private ArrayList<Location> locations = new ArrayList<>();

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

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
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
