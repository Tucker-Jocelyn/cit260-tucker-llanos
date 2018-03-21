/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.AnimalsPlants;
import OregonTrail.model.CharacterDefinitions;
import OregonTrail.model.Team;
import java.util.ArrayList;
import OregonTrail.model.Character;
import exceptions.TeamControlException;

/**
 *
 * @author Kim Llanos v3.3 TeamControl and Jocelyn Tucker
 */
public abstract class TeamControl {

    /**
     * Calculates how much of the hunted animals (in pounds) the team retains.
     *
     * @param teamHuntingSkillLevel
     * @param hasAnimal
     * @return
     */
    public static double calcTeamHuntingIncrease(int teamHuntingSkillLevel, int hasAnimal) throws TeamControlException {

        //basic validity rules: NO hunting skills (level 0), NO animals
        if (teamHuntingSkillLevel < 0 || hasAnimal < 1) {
            //teamAnimalWeight = teamAnimalWeight * hasAnimal;
            //return -999;
            throw new TeamControlException("You cannot hunt, because there are no animals, or you do not have the sufficent skill level.");
        }

        double teamAnimalWeight = AnimalsPlants.ANIMAL.weight * hasAnimal;

        if (teamHuntingSkillLevel == 6 || teamHuntingSkillLevel == 5) {
            teamAnimalWeight *= 0.75;
        } else if (teamHuntingSkillLevel == 4 || teamHuntingSkillLevel == 3) {
            teamAnimalWeight *= 0.5;
        } else {
            teamAnimalWeight *= 0.25;
        }

        return teamAnimalWeight;
    }

    /**
     * Calculates how much of the gathered plants (in pounds) the team retains.
     *
     * @param teamGatheringSkillLevel
     * @param hasPlant
     * @return
     */
    public static double calcTeamGatheringIncrease(int teamGatheringSkillLevel, int hasPlant) throws TeamControlException {

        //basic validity rules: NO gathering skills (level 0), NO plants
        if (teamGatheringSkillLevel < 0 || hasPlant < 1) {
            //teamPlantWeight = teamPlantWeight * hasPlant;
            //return -999;
            throw new TeamControlException("You cannot gather, because there are no plants, or you do not have the sufficent skill level.");
        }

        double teamPlantWeight = AnimalsPlants.PLANT.weight * hasPlant;

        if (teamGatheringSkillLevel == 6 || teamGatheringSkillLevel == 5) {
            teamPlantWeight *= 0.75;
        } else if (teamGatheringSkillLevel == 4 || teamGatheringSkillLevel == 3) {
            teamPlantWeight *= 0.5;
        } else {
            teamPlantWeight *= 0.25;
        }

        return teamPlantWeight;
    }

    /*
    public static CharacterDefinitions[] createTeam() {
        CharacterDefinitions[] teamMembers = CharacterDefinitions.values();
        //teamMembers[CharacterDefinitions.KIRK.ordinal()] = CharcterDefinitions.KIRK;
        return teamMembers;
    }
     */
    public static Team createTeam() {
        CharacterDefinitions[] charDef = CharacterDefinitions.values();
        Character[] teamMembers = new Character[6];
        for (CharacterDefinitions current : charDef) {
            teamMembers[current.ordinal()] = new Character(current);
        }
        Team team = new Team();
        team.setTeam(teamMembers);
        return team;
    }

    /*array of Char Defn index to get index position within the array
     */
    public static int getCharIndex(String charName) throws TeamControlException {
        CharacterDefinitions[] charDef = CharacterDefinitions.values();

        for (int i = 0; i < charDef.length; i++) {
            if (charDef[i].getCharacterName().equals (charName) )
                return i;
        }
        //return -1;
        throw new TeamControlException("Character not found.");
    }
       
}

