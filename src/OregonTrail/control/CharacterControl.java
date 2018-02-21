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

public class CharacterControl {
    
public static int calcCharacterHuntingIncrease (int characterHuntingSkill,  int animalPlantWeight, int hasAnimal) {
    
    //check to see if there are available animals to hunt
    if (hasAnimal <=0) {
       return -999;   
    } 
    
    //set sum(characterHuntingSkillLevel to teamHuntingSkill), validate char skills = team skills to move forward with hunting
    int teamHuntingSkillLevel = (characterHuntingSkill+characterHuntingSkill);
    
	//check to see if hunting skill levels are valid to hunt
    if ((teamHuntingSkillLevel)<=0) {    
       return -999;  
    }

    int teamAnimalWeight = 0;
    
    //hunting and retention of hunted animals based on skill levels retention @25%
    if (teamHuntingSkillLevel >0 && teamHuntingSkillLevel <3) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/4;
    }
   
    //hunting and retention of hunted animals based on skill levels retention @50%
    else if (teamHuntingSkillLevel >2 && teamHuntingSkillLevel <5) {
    teamAnimalWeight = (hasAnimal*animalPlantWeight)/2;
    }
    
    //hunting and retention of hunted animals based on skill levels retention @75%
    else if (teamHuntingSkillLevel >4 && teamHuntingSkillLevel <7) {        
    teamAnimalWeight = (hasAnimal*animalPlantWeight)*(3/4);
    }

        return teamAnimalWeight;
    }    
    }
  
