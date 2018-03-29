package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jocelyn Tucker
 */
public class CurrentDate implements Serializable {

    //class instance variables
    private int date;
    private String dayOfWeek;
    private ArrayList<Game> games = new ArrayList<>();
    private Location location;

    public CurrentDate() {
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.date;
        hash = 11 * hash + Objects.hashCode(this.dayOfWeek);
        hash = 11 * hash + Objects.hashCode(this.games);
        hash = 11 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "CurrentDate{" + "date=" + date + ", dayOfWeek=" + dayOfWeek + ", games=" + games + ", location=" + location + '}';
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
        final CurrentDate other = (CurrentDate) obj;
        if (this.date != other.date) {
            return false;
        }
        if (!Objects.equals(this.dayOfWeek, other.dayOfWeek)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
