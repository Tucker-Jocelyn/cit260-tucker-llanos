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
 * @author kimllanos
 */
public class Team implements Serializable {
    
    private String name;
    private String status;
    private String supplies;
    private String pace;
    private int members;
    private String distanceTraveled;
    private String livestock;
    private Game game;
    private Player player;

    public Team() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(String distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public String getLivestock() {
        return livestock;
    }

    public void setLivestock(String livestock) {
        this.livestock = livestock;
        
        
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + Objects.hashCode(this.pace);
        hash = 79 * hash + this.members;
        hash = 79 * hash + Objects.hashCode(this.distanceTraveled);
        hash = 79 * hash + Objects.hashCode(this.livestock);
        return hash;
        
        
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", status=" + status + ", supplies=" + supplies + ", pace=" + pace + ", members=" + members + ", distanceTraveled=" + distanceTraveled + ", livestock=" + livestock + '}';
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
        final Team other = (Team) obj;
        if (this.members != other.members) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.supplies, other.supplies)) {
            return false;
        }
        if (!Objects.equals(this.pace, other.pace)) {
            return false;
        }
        if (!Objects.equals(this.distanceTraveled, other.distanceTraveled)) {
            return false;
        }
        if (!Objects.equals(this.livestock, other.livestock)) {
            return false;
        }
        return true;
    }
    
    
}
