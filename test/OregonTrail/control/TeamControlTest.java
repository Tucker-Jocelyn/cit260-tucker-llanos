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
 * @author Kim Llanos
 * v3.3 TeamControlTest
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
    
   
    
    //#1 INVALID OVERALL: no teamHuntingSkillLevel; no available animals v3.1 correct
    @Test
    public void testCalcTeamHuntingIncrease() {
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tValidity Test #1  (NO hunting skills, and NO animals to hunt) ");
        
        //input variables
        int teamHuntingSkillLevel = 0; 
        int animalPlantWeight = 0;
        int hasAnimal = 0;
        double teamAnimalWeight = 0;
        
        //expected output variable
        double expResult = -999;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
     }
    

    @Test
        public void testCase2 (){
        //#3 AVAILABLE animals to hunt, but NO hunting skills
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tValidity Test #3 (AVAILABLE animals to hunt, but NO hunting skills) ");
        
        //input variables
        int teamHuntingSkillLevel = 0;
        int animalPlantWeight = 15;
        int hasAnimal = 4;
        double teamAnimalWeight = 15;
        
        //expected output variable
        double expResult = 15;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);

    }
    
        @Test
        public void testCase3 (){
        //#3: 25% retention of hunted animals: skill level (1)
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tValidity Test #2 (VALID hunting skills, NO animals to hunt) ");
        
        //input variables
        int teamHuntingSkillLevel = 5;
        int animalPlantWeight = 15;
        int hasAnimal = 0;
        double teamAnimalWeight = 0;
        
        //expected output variable
        double expResult = -999;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.000001);

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
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
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
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);

    }
        
        @Test
        public void testCase555 (){
        //#555 & #666 Upper-Boundary VALID team HUNTING SKILLS (level 6), and HIGH amount of animals (75% retention)
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tLower-Boundary Test #1 (VALID hunting skill (level 0), 1++ animals to hunt) ");
        
        //input variables
        int teamHuntingSkillLevel = 0;
        int animalPlantWeight = 15;
        int hasAnimal = 10;
        double teamAnimalWeight = 37.5;
        
        //expected output variable
        double expResult = 37.5;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
        
        
        
        @Test
        public void testCase777 (){
        //#####Lower-Boundary VALID team HUNTING SKILLS (level 0), and ANY (1++) amount of animals (@min 25% retention)
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tLower-Boundary Test #1 (VALID hunting skill (level 0), 1++ animals to hunt) ");
        
        //input variables
        int teamHuntingSkillLevel = 0;
        int animalPlantWeight = 15;
        int hasAnimal = 8;
        double teamAnimalWeight = 30;
        
        //expected output variable
        double expResult = 30;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
        
    @Test
        public void testCase888 (){
        //#####Lower-Boundary VALID team HUNTING SKILLS (level 0), and ANY (1++) amount of animals (@min 25% retention)
        System.out.println("\ncalcTeamHuntingIncrease");
        System.out.println("\tLower-Boundary Test #2 (VALID hunting skill (level 0), 1 animal to hunt) ");
        
        //input variables
        int teamHuntingSkillLevel = 0;
        int animalPlantWeight = 15;
        int hasAnimal = 1;
        double teamAnimalWeight = 3.75;
        
        //expected output variable
        double expResult = 3.75;
        
        //call the method
        double result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, hasAnimal);
        
        System.out.println("expected result = " + expResult);
        System.out.println("actual result = " + result);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }    
}
