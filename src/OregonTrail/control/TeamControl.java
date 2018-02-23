/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;


/**
 *
 * @author Kim Llanos
 */
public class TeamControl {
    
public static double calcTeamHuntingIncrease (int teamHuntingSkillLevel, int animalPlantWeight, int hasAnimal, double teamAnimalWeight) {
    //#1 check to see if there are available animals to hunt
   /* if (hasAnimal <=0) {
       return -999;   
    } 
    
     //#2 check to see if hunting skill levels are valid to hunt
     if ((teamHuntingSkillLevel)<=0) {    
       return -999;  
    }
  */    

    //#3 hunting and retention of hunted animals based on skill levels (1) retention @25% 
    if (teamHuntingSkillLevel>=1 && teamHuntingSkillLevel<2) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    
        //#4 hunting and retention of hunted animals based on skill level (2) retention @25% 
        if (teamHuntingSkillLevel>=2 && teamHuntingSkillLevel<3) {
        teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
        }
    }
    
 
    //#6 hunting and retention of hunted animals based on skill level (3) retention @50% 
    if (teamHuntingSkillLevel>=3 && teamHuntingSkillLevel<4) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/2;

        //#6 hunting and retention of hunted animals based on skill level (4) retention @50% 
        if (teamHuntingSkillLevel>=4 && teamHuntingSkillLevel<5) {
        teamAnimalWeight = (hasAnimal*animalPlantWeight)/2;
        }
    }

    
    //#7 hunting and retention of hunted animals based on skill levels (5) retention @75% 
    if (teamHuntingSkillLevel>=5 && teamHuntingSkillLevel<6) {       
    teamAnimalWeight = (hasAnimal*animalPlantWeight)*(3/4);
    
        //#7 hunting and retention of hunted animals based on skill level (6) retention @75% 
        if (teamHuntingSkillLevel>=6 && teamHuntingSkillLevel<7) {       
        teamAnimalWeight = (hasAnimal*animalPlantWeight)*(3/4);
        }
    }

   
    // #8 team hunting skills = (0), and any amount of animals
    if (teamHuntingSkillLevel<=0 & hasAnimal>0) {
     teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    }
 
        return teamAnimalWeight;
        }       
}
