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
    
public static int calcTeamHuntingIncrease (int teamHuntingSkillLevel, int animalPlantWeight, int hasAnimal, int teamAnimalWeight) {
    //check to see if there are available animals to hunt
    
    
    if (hasAnimal <=0) {
       return -999;   
    } 
   
    // lowest threshold of team hunting skills and any amount of animals
    if (teamHuntingSkillLevel<=0 && hasAnimal >=0) {
     teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    }
    
    //check to see if hunting skill levels are valid to hunt
     if ((teamHuntingSkillLevel)<=0) {    
       return -999;  
    }
    
    //hunting and retention of hunted animals based on skill levels retention @25% 
    if (teamHuntingSkillLevel<=0 && teamHuntingSkillLevel<=1) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    
    //hunting and retention of hunted animals based on skill levels retention @25% 
    if (teamHuntingSkillLevel<=2 && teamHuntingSkillLevel<=3) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    }
    
    }
   
    
    //hunting and retention of hunted animals based on skill levels retention @25% 
    else if (teamHuntingSkillLevel<=2 && teamHuntingSkillLevel<=3) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    }

    //hunting and retention of hunted animals based on skill levels retention @50% (level 3 & 4) 
    else if (teamHuntingSkillLevel<=3 && teamHuntingSkillLevel<=4) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/2;
    }

    
    //hunting and retention of hunted animals based on skill levels retention @75% (level 5 & 6)
    else if (teamHuntingSkillLevel<=5 && teamHuntingSkillLevel<=6) {       
    teamAnimalWeight = (hasAnimal*animalPlantWeight)*(3/4);
    }

        return teamAnimalWeight;
        }       
}


