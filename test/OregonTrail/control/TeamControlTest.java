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
 * @author kimta
 */
public class TeamControlTest {
    
    public TeamControlTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of calcTeamHuntingIncrease method, of class TeamControl.
     */
    @Test
    public void testCalcTeamHuntingIncrease() {
        System.out.println("calcTeamHuntingIncrease");
        int teamHuntingSkillLevel = 0;
        int animalPlantWeight = 0;
        int hasAnimal = 0;
        double teamAnimalWeight = 0.0;
        double expResult = 0.0;
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, animalPlantWeight, hasAnimal, teamAnimalWeight);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
        public void testCase6 (){
        //test , col. #6 of text matrix: : upper-boundary hunting skill parameters
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tTest Case 6 (column #6: upper-boundary hunting skills) ");
        
        //input variables
        int teamHuntingSkillLevel = 6;
        int animalPlantWeight = 15;
        int hasAnimal = 4;
        double teamAnimalWeight = 45;
        
        //expected output variable
        double expResult = 45;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, animalPlantWeight, hasAnimal, teamAnimalWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);

    }
        
        @Test
        public void testCase7 (){
        //test , col. #7 of text matrix: : lower-boundary hunting skill parameters
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tTest Case 7 (column #7: lower-boundary hunting skills) ");
        
        //input variables
        int teamHuntingSkillLevel = 0;
        int animalPlantWeight = 15;
        int hasAnimal = 4;
        double teamAnimalWeight = 15;
        
        //expected output variable
        double expResult = 15;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, animalPlantWeight, hasAnimal, teamAnimalWeight);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);

    }
}
