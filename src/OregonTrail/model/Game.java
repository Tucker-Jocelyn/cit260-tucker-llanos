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
public class Game implements Serializable {

    private Map map;
    private double totalDistanceTraveled;
    private String date;
    private double milesToSLC;
    private Player player;
    private CurrentDate currentDate;
    private Inventory inventory;
    private Team team;

    public Game() {
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.map);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalDistanceTraveled) ^ (Double.doubleToLongBits(this.totalDistanceTraveled) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.date);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.milesToSLC) ^ (Double.doubleToLongBits(this.milesToSLC) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.player);
        hash = 23 * hash + Objects.hashCode(this.currentDate);
        hash = 23 * hash + Objects.hashCode(this.inventory);
        hash = 23 * hash + Objects.hashCode(this.team);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "map=" + map + ", totalDistanceTraveled=" + totalDistanceTraveled + ", date=" + date + ", milesToSLC=" + milesToSLC + ", player=" + player + ", currentDate=" + currentDate + ", inventory=" + inventory + ", team=" + team + '}';
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
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.currentDate, other.currentDate)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.team, other.team)) {
            return false;
        }
        return true;
    }

}
