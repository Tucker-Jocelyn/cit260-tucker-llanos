/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.CharacterDefinitions;
import OregonTrail.model.Team;
import java.util.ArrayList;
import OregonTrail.model.Character;

/**
 *
 * @author Kim Llanos v3.3 TeamControl and Jocelyn Tucker
 */
public abstract class TeamControl {

    /**
     * Calculates how much of the hunted animals (in pounds) the team retains.
     *
     * @param teamHuntingSkillLevel
     * @param animalPlantWeight - Always 15
     * @param hasAnimal
     * @return
     */
    public static double calcTeamHuntingIncrease(int teamHuntingSkillLevel, int animalPlantWeight, int hasAnimal) {

        //basic validity rules: NO hunting skills (level 0), NO animals
        if (teamHuntingSkillLevel < 0 || hasAnimal < 1) {
            //teamAnimalWeight = teamAnimalWeight * hasAnimal;
            return -999;
        }

        double teamAnimalWeight = animalPlantWeight * hasAnimal;

        if (teamHuntingSkillLevel == 6 || teamHuntingSkillLevel == 5) {
            teamAnimalWeight *= 0.75;
        } else if (teamHuntingSkillLevel == 4 || teamHuntingSkillLevel == 3) {
            teamAnimalWeight *= 0.5;
        } else {
            teamAnimalWeight *= 0.25;
        }

        return teamAnimalWeight;
    }

    public static Team createTeam() {
        ArrayList<CharacterDefinitions> teamMembers = new ArrayList<>();
        teamMembers.add(CharacterDefinitions.KIRK);
        teamMembers.add(CharacterDefinitions.SPOCK);
        teamMembers.add(CharacterDefinitions.BONES);
        teamMembers.add(CharacterDefinitions.REDSHIRT1);
        teamMembers.add(CharacterDefinitions.REDSHIRT2);
        teamMembers.add(CharacterDefinitions.PLAYER);
        return teamMembers;
    }
}
