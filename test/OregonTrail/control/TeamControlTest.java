/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kim Llanos
 */
public class TeamControlTest {
    
    public TeamControlTest() {
    }

    /**
     * Test of calcTeamHuntingIncrease method, of class TeamControl.
     */
    @Test
    public void testCalcTeamHuntingIncrease() {
        System.out.println("calcTeamHuntingIncrease");
        int teamHuntingSkillLevel = 5;
        int animalPlantWeight = 15;
        int hasAnimal = 4;
        int teamAnimalWeight = 45;
        int expResult = 45;
        int result = TeamControl.calcTeamHuntingIncrease(teamHuntingSkillLevel, animalPlantWeight, hasAnimal, teamAnimalWeight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
