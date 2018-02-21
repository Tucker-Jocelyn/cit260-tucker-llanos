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

}