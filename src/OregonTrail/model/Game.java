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
 * @author kim-jocelyn
 */
public class Game implements Serializable{
    private String team;
    private String map;
    private double totalDistanceTraveled;
    private String date;
    private double milesToSLC;
    private Player player;
    private CurrentDate currentDate;
    private ArrayList<InventoryItem> inventoryItems = new ArrayList<>();
    
    public Game() {
    }
    
    

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public double getTotalDistanceTraveled() {
        return totalDistanceTraveled;
    }

    public void setTotalDistanceTraveled(double totalDistanceTraveled) {
        this.totalDistanceTraveled = totalDistanceTraveled;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMilesToSLC() {
        return milesToSLC;
    }

    public void setMilesToSLC(double milesToSLC) {
        this.milesToSLC = milesToSLC;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CurrentDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(CurrentDate currentDate) {
        this.currentDate = currentDate;
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.team);
        hash = 37 * hash + Objects.hashCode(this.map);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalDistanceTraveled) ^ (Double.doubleToLongBits(this.totalDistanceTraveled) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.date);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.milesToSLC) ^ (Double.doubleToLongBits(this.milesToSLC) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "team=" + team + ", map=" + map + ", totalDistanceTraveled=" + totalDistanceTraveled + ", date=" + date + ", milesToSLC=" + milesToSLC + '}';
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
        if (Double.doubleToLongBits(this.milesToSLC) != Double.doubleToLongBits(other.milesToSLC)) {
            return false;
        }
        if (!Objects.equals(this.team, other.team)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
