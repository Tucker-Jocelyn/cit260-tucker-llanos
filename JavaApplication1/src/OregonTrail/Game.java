/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import java.util.Objects;

/**
 *
 * @author kimta
 */
public class Game implements Serializable {
    
    //class instance variables
    private double totalDistanceTraveled;
    private string date;
    private Player player;

    public Game() {
    }
    
    

    public double getTotalDistanceTraveled() {
        return totalDistanceTraveled;
    }

    public void setTotalDistanceTraveled(double totalDistanceTraveled) {
        this.totalDistanceTraveled = totalDistanceTraveled;
    }

    public string getDate() {
        return date;
    }

    public void setDate(string date) {
        this.date = date;
        
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.totalDistanceTraveled) ^ (Double.doubleToLongBits(this.totalDistanceTraveled) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.date);
        return hash;
        
        
    }

    @Override
    public String toString() {
        return "Game{" + "totalDistanceTraveled=" + totalDistanceTraveled + ", date=" + date + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalDistanceTraveled) != Double.doubleToLongBits(other.totalDistanceTraveled)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
