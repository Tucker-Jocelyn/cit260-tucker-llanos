/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tim
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcWagonLoadWeight method, of class ResourceControl.
    *test 1 valid wagon load weight + animal & plant weights
    * test 2 wagon load weight + animal & plant weight is over the max wagon load weight
    * test 3 upper boundary wagon load weight + animal & plant weights
    * test 4 lower boundary wagon load weight + animal & plant weights
    * 
    */
    
    //test 1 (columns 1 & 2 of test matrix) Valid parameters wagon load weight + team animal plant weight < max load weight
    @Test
    public void testCalcWagonLoadWeight() {
        System.out.println("calcWagonLoadWeight");
        System.out.println("\tTest Case 1 (columns 1 & 2) ");
     
        
        //input variable
        int teamAnimalWeight = 45;
        int teamPlantWeight = 30;
        double currentWagonLoadWeight = 3000;
        double maxCarryWeight = 4000;
        
        //expected output variable
        double expResult = 3075;
        
        //call the method
        double result = ResourceControl.calcWagonLoadWeight(teamAnimalWeight, teamPlantWeight, currentWagonLoadWeight, maxCarryWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);
        
   
    
//test 2-A (columns 3 of test matrix) wagon load weight + team animal weight > max load weight
        System.out.println("calcWagonLoadWeight");
        System.out.println("\tTest Case 2-A (column 3: animal weight ONLY)");
        
        //input variable
        teamAnimalWeight = 45;
        teamPlantWeight = 0;
        currentWagonLoadWeight = 3990;
        maxCarryWeight = 4000;
        
        //expected output variable
        expResult = -999;
        
        //call the method
        result = ResourceControl.calcWagonLoadWeight(teamAnimalWeight, teamPlantWeight, currentWagonLoadWeight, maxCarryWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);

        
 //test 2-B (columns 4 of test matrix) wagon load weight + team plant weight > max load weight
        System.out.println("calcWagonLoadWeight");
        System.out.println("\tTest Case 2-B (column 4: plant weight ONLY)");
        
        //input variable
        teamAnimalWeight = 0;
        teamPlantWeight = 30;
        currentWagonLoadWeight = 3990;
        maxCarryWeight = 4000;
        
        //expected output variable
        expResult = -999;
        
        //call the method
        result = ResourceControl.calcWagonLoadWeight(teamAnimalWeight, teamPlantWeight, currentWagonLoadWeight, maxCarryWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);

        
        
       //test 3 (boundary columns 9 & 10 upper limit in test matrix)Upper wagon load weight boundary = valid with added animals and plants
        System.out.println("calcWagonLoadWeight");
        System.out.println("\tTest Case 3 (boundary columns 9 & 10 upper limit)");
        
        //input variable
        teamAnimalWeight = 45;
        teamPlantWeight = 30;
        currentWagonLoadWeight = 3925;
        maxCarryWeight = 4000;
        
        //expected output variable
        expResult = 4000;
        
        //call the method
        result = ResourceControl.calcWagonLoadWeight(teamAnimalWeight, teamPlantWeight, currentWagonLoadWeight, maxCarryWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);

        
        //test 4 (boundary columns 11 & 12 lower limit in test matrix)lower wagon load weight boundary = valid with added animals and plants
        System.out.println("calcWagonLoadWeight");
        System.out.println("\tTest Case 4 (boundary columns 11 & 12 lower limit)");
        
        //input variable
        teamAnimalWeight = 45;
        teamPlantWeight = 30;
        currentWagonLoadWeight = 1300;
        maxCarryWeight = 4000;
        
        //expected output variable
        expResult = 1375;
        
        //call the method
        result = ResourceControl.calcWagonLoadWeight(teamAnimalWeight, teamPlantWeight, currentWagonLoadWeight, maxCarryWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);
   
}
}