/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

/**
 *
 * @author Jocelyn & Kim
 */

public class ResourceControl {

public static double calcWagonLoadWeight(int teamAnimalWeight, int teamPlantWeight, double currentWagonLoadWeight, double maxCarryWeight) {
   
    if (teamAnimalWeight < 0){
        return -999;
}

    if (teamPlantWeight < 0){
        return -999;
}
    if (currentWagonLoadWeight >= maxCarryWeight){
        return -999;
    }
    
    //Add weight of hunted and gatherd resources to current wagon load weight
    double teamAnimalPlantWeight = teamAnimalWeight + teamPlantWeight;
    currentWagonLoadWeight += teamAnimalPlantWeight;
    
    //Check current wagon load weight against max carry weight
    if (currentWagonLoadWeight <= maxCarryWeight){
        return currentWagonLoadWeight;
    }
    
    else {
        return -999;
    }
    
}

public static int calcTeamHuntingIncrease (int teamHuntingSkillLevel, int animalPlantWeight, int hasAnimal, int teamAnimalWeight) {
    //check to see if there are available animals to hunt
    if (hasAnimal <=0) {
       return -999;   
    } 
    
	//check to see if hunting skill levels are valid to hunt
    if ((teamHuntingSkillLevel)<=0) {    
       return -999;  
    }

    
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