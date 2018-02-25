/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;


/**
 *
 * @author Kim Llanos
 * v3.3 TeamControl
 */


public abstract class TeamControl {
    /**
     * Calculates how much of the hunted animals (in pounds) the team retains.
     * @param teamHuntingSkillLevel
     * @param animalPlantWeight - Always 15
     * @param hasAnimal
     * @return 
     */

    
public static double calcTeamHuntingIncrease(int teamHuntingSkillLevel, int animalPlantWeight, int hasAnimal) {
    
    //basic validity rules: NO hunting skills (level 0), NO animals 
    if (teamHuntingSkillLevel<0 || hasAnimal<1) {
     //teamAnimalWeight = teamAnimalWeight * hasAnimal;
    return -999;
    }
	
    double teamAnimalWeight = animalPlantWeight * hasAnimal;
    
    if (teamHuntingSkillLevel == 6 || teamHuntingSkillLevel == 5) {
    teamAnimalWeight *= 0.75;
    } 
    
    else if (teamHuntingSkillLevel == 4 || teamHuntingSkillLevel == 3) {
    teamAnimalWeight *= 0.5;
    } 
    
    else {
    teamAnimalWeight *= 0.25;
   }

   return teamAnimalWeight;
   }       
}
