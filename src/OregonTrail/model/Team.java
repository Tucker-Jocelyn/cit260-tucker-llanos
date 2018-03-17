/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Arrays;

/**
 *
 * @author kimllanos
 */
public class Team implements Serializable {

    private String name;
    private String status;
    private String teamAllResources;
    private String pace;
    private String dailyDistanceTraveled;
    private String livestock;
    private double currentWagonLoadWeight;
    private String teamInventoryResource;
    private int teamAllSkillLevel;
    private int teamHuntingSkillLevel;
    private int teamGatheringSkillLevel;
    private boolean teamRest;
    private int teamSkillLevel;
    private double teamAnimalWeight;
    private double teamPlantWeight;
    private int money;
    private Wagon wagon;
    private Ox ox;

    //public CharacterDefinitions[] teamMembers = CharacterDefinitions.values();
    private Character[] team = new Character[CharacterDefinitions.values().length];
    private Inventory inventory;

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

    public double getTeamAnimalWeight() {
        return teamAnimalWeight;
    }

    public void setTeamAnimalWeight(double teamAnimalWeight) {
        this.teamAnimalWeight = teamAnimalWeight;
    }

    public double getTeamPlantWeight() {
        return teamPlantWeight;
    }

    public void setTeamPlantWeight(double teamPlantWeight) {
        this.teamPlantWeight = teamPlantWeight;
    }

    public Character[] getTeam() {
        return team;
    }

    public void setTeam(Character[] team) {
        this.team = team;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public Ox getOx() {
        return ox;
    }

    public void setOx(Ox ox) {
        this.ox = ox;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.status);
        hash = 89 * hash + Objects.hashCode(this.teamAllResources);
        hash = 89 * hash + Objects.hashCode(this.pace);
        hash = 89 * hash + Objects.hashCode(this.dailyDistanceTraveled);
        hash = 89 * hash + Objects.hashCode(this.livestock);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.currentWagonLoadWeight) ^ (Double.doubleToLongBits(this.currentWagonLoadWeight) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.teamInventoryResource);
        hash = 89 * hash + this.teamAllSkillLevel;
        hash = 89 * hash + this.teamHuntingSkillLevel;
        hash = 89 * hash + this.teamGatheringSkillLevel;
        hash = 89 * hash + (this.teamRest ? 1 : 0);
        hash = 89 * hash + this.teamSkillLevel;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.teamAnimalWeight) ^ (Double.doubleToLongBits(this.teamAnimalWeight) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.teamPlantWeight) ^ (Double.doubleToLongBits(this.teamPlantWeight) >>> 32));
        hash = 89 * hash + this.money;
        hash = 89 * hash + Objects.hashCode(this.wagon);
        hash = 89 * hash + Objects.hashCode(this.ox);
        hash = 89 * hash + Arrays.deepHashCode(this.team);
        hash = 89 * hash + Objects.hashCode(this.inventory);
        return hash;
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", status=" + status + ", teamAllResources=" + teamAllResources + ", pace=" + pace + ", dailyDistanceTraveled=" + dailyDistanceTraveled + ", livestock=" + livestock + ", currentWagonLoadWeight=" + currentWagonLoadWeight + ", teamInventoryResource=" + teamInventoryResource + ", teamAllSkillLevel=" + teamAllSkillLevel + ", teamHuntingSkillLevel=" + teamHuntingSkillLevel + ", teamGatheringSkillLevel=" + teamGatheringSkillLevel + ", teamRest=" + teamRest + ", teamSkillLevel=" + teamSkillLevel + ", teamAnimalWeight=" + teamAnimalWeight + ", teamPlantWeight=" + teamPlantWeight + ", money=" + money + ", wagon=" + wagon + ", ox=" + ox + ", team=" + team + ", inventory=" + inventory + '}';
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
        if (Double.doubleToLongBits(this.teamAnimalWeight) != Double.doubleToLongBits(other.teamAnimalWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.teamPlantWeight) != Double.doubleToLongBits(other.teamPlantWeight)) {
            return false;
        }
        if (this.money != other.money) {
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
        if (!Objects.equals(this.wagon, other.wagon)) {
            return false;
        }
        if (!Objects.equals(this.ox, other.ox)) {
            return false;
        }
        if (!Arrays.deepEquals(this.team, other.team)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

}
