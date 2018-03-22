/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import exceptions.ResourceControlException;

/**
 *
 * @author Jocelyn & Kim
 */

public class ResourceControl {

public static double calcWagonLoadWeight(double teamAnimalWeight, double teamPlantWeight, double currentWagonLoadWeight, double maxCarryWeight) throws ResourceControlException {
   
    if (teamAnimalWeight < 0){
        //return -999;
        throw new ResourceControlException("There are no hunted animals to add to your wagon.");
}

    if (teamPlantWeight < 0){
        //return -999;
         throw new ResourceControlException("There are no gathered plants to add to your wagon.");
}
    if (currentWagonLoadWeight >= maxCarryWeight){
        //return -999;
         throw new ResourceControlException("You have no more room in your wagon.");
    }
    
    //Add weight of hunted and gatherd resources to current wagon load weight
    double teamAnimalPlantWeight = teamAnimalWeight + teamPlantWeight;
    currentWagonLoadWeight += teamAnimalPlantWeight;
    
    //Check current wagon load weight against max carry weight
    if (currentWagonLoadWeight <= maxCarryWeight){
        return currentWagonLoadWeight;
    }
    
    else {
        //return -999;
        throw new ResourceControlException("Cannot add items to your wagon as they will exceed the maximun load weight.");
    }
    
}

    public static double calcMoneyResource(int inventoryType, int inventoryAmount) {
       double money = 0;
        System.out.println("*** calcMoneyResource() called ***");
       
       return money;
               
    }
}