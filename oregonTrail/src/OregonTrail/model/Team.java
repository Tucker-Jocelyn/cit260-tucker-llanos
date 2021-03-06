/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author kimllanos
 */
public class Team implements Serializable {
    
    private String name;
    private String status;
    private String teamAllResources;
    private String pace;
    private int members;
    private String dailyDistanceTraveled;
    private String livestock;
    private double currentWagonLoadWeight;
    private String teamInventoryResource;
    private int teamAllSkillLevel;
    private int teamHuntingSkillLevel;
    private int teamGatheringSkillLevel;
    private boolean teamRest;
    private int teamSkillLevel;
    private int teamAnimalWeight;
    private int teamPlantWeight;
    private Game game;
    private Player player;
    private ArrayList<Character> characters = new ArrayList<>();

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

    public String getTeamAllResources() {
        return teamAllResources;
    }

    public void setTeamAllResources(String teamAllResources) {
        this.teamAllResources = teamAllResources;
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

    public String getDailyDistanceTraveled() {
        return dailyDistanceTraveled;
    }

    public void setDailyDistanceTraveled(String dailyDistanceTraveled) {
        this.dailyDistanceTraveled = dailyDistanceTraveled;
    }

    public String getLivestock() {
        return livestock;
    }

    public void setLivestock(String livestock) {
        this.livestock = livestock;
    }

    public double getCurrentWagonLoadWeight() {
        return currentWagonLoadWeight;
    }

    public void setCurrentWagonLoadWeight(double currentWagonLoadWeight) {
        this.currentWagonLoadWeight = currentWagonLoadWeight;
    }

    public String getTeamInventoryResource() {
        return teamInventoryResource;
    }

    public void setTeamInventoryResource(String teamInventoryResource) {
        this.teamInventoryResource = teamInventoryResource;
    }

    public int getTeamAllSkillLevel() {
        return teamAllSkillLevel;
    }

    public void setTeamAllSkillLevel(int teamAllSkillLevel) {
        this.teamAllSkillLevel = teamAllSkillLevel;
    }

    public int getTeamHuntingSkillLevel() {
        return teamHuntingSkillLevel;
    }

    public void setTeamHuntingSkillLevel(int teamHuntingSkillLevel) {
        this.teamHuntingSkillLevel = teamHuntingSkillLevel;
    }

    public int getTeamGatheringSkillLevel() {
        return teamGatheringSkillLevel;
    }

    public void setTeamGatheringSkillLevel(int teamGatheringSkillLevel) {
        this.teamGatheringSkillLevel = teamGatheringSkillLevel;
    }

    public boolean isTeamRest() {
        return teamRest;
    }

    public void setTeamRest(boolean teamRest) {
        this.teamRest = teamRest;
    }

    public int getTeamSkillLevel() {
        return teamSkillLevel;
    }

    public void setTeamSkillLevel(int teamSkillLevel) {
        this.teamSkillLevel = teamSkillLevel;
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

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public int getTeamAnimalWeight() {
        return teamAnimalWeight;
    }

    public void setTeamAnimalWeight(int teamAnimalWeight) {
        this.teamAnimalWeight = teamAnimalWeight;
    }

    public int getTeamPlantWeight() {
        return teamPlantWeight;
    }

    public void setTeamPlantWeight(int teamPlantWeight) {
        this.teamPlantWeight = teamPlantWeight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.teamAllResources);
        hash = 67 * hash + Objects.hashCode(this.pace);
        hash = 67 * hash + this.members;
        hash = 67 * hash + Objects.hashCode(this.dailyDistanceTraveled);
        hash = 67 * hash + Objects.hashCode(this.livestock);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.currentWagonLoadWeight) ^ (Double.doubleToLongBits(this.currentWagonLoadWeight) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.teamInventoryResource);
        hash = 67 * hash + this.teamAllSkillLevel;
        hash = 67 * hash + this.teamHuntingSkillLevel;
        hash = 67 * hash + this.teamGatheringSkillLevel;
        hash = 67 * hash + (this.teamRest ? 1 : 0);
        hash = 67 * hash + this.teamSkillLevel;
        hash = 67 * hash + this.teamAnimalWeight;
        hash = 67 * hash + this.teamPlantWeight;
        return hash;
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", status=" + status + ", teamAllResources=" + teamAllResources + ", pace=" + pace + ", members=" + members + ", dailyDistanceTraveled=" + dailyDistanceTraveled + ", livestock=" + livestock + ", currentWagonLoadWeight=" + currentWagonLoadWeight + ", teamInventoryResource=" + teamInventoryResource + ", teamAllSkillLevel=" + teamAllSkillLevel + ", teamHuntingSkillLevel=" + teamHuntingSkillLevel + ", teamGatheringSkillLevel=" + teamGatheringSkillLevel + ", teamRest=" + teamRest + ", teamSkillLevel=" + teamSkillLevel + ", teamAnimalWeight=" + teamAnimalWeight + ", teamPlantWeight=" + teamPlantWeight + '}';
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
        if (Double.doubleToLongBits(this.currentWagonLoadWeight) != Double.doubleToLongBits(other.currentWagonLoadWeight)) {
            return false;
        }
        if (this.teamAllSkillLevel != other.teamAllSkillLevel) {
            return false;
        }
        if (this.teamHuntingSkillLevel != other.teamHuntingSkillLevel) {
            return false;
        }
        if (this.teamGatheringSkillLevel != other.teamGatheringSkillLevel) {
            return false;
        }
        if (this.teamRest != other.teamRest) {
            return false;
        }
        if (this.teamSkillLevel != other.teamSkillLevel) {
            return false;
        }
        if (this.teamAnimalWeight != other.teamAnimalWeight) {
            return false;
        }
        if (this.teamPlantWeight != other.teamPlantWeight) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.teamAllResources, other.teamAllResources)) {
            return false;
        }
        if (!Objects.equals(this.pace, other.pace)) {
            return false;
        }
        if (!Objects.equals(this.dailyDistanceTraveled, other.dailyDistanceTraveled)) {
            return false;
        }
        if (!Objects.equals(this.livestock, other.livestock)) {
            return false;
        }
        if (!Objects.equals(this.teamInventoryResource, other.teamInventoryResource)) {
            return false;
        }
        return true;
    }

     
}

    