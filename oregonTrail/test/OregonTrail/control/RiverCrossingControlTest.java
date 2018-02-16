package OregonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingControlTest {
    
    public RiverCrossingControlTest() {
    }

    /**
     * Test of calcSuccessProbability method, of class RiverCrossingControl.
     */
    @Test
    public void testCalcSuccessProbability() {
        System.out.println("calcSuccessProbability");
        double currentWagonLoadWeight = 0.0;
        double wagonWeight = 0.0;
        double waterDepth = 0.0;
        int length = 0;
        int oxHealth = 0;
        double expResult = -99;
        double result = RiverCrossingControl.calcSuccessProbability(currentWagonLoadWeight, wagonWeight, waterDepth, length, oxHealth);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCase1() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 10, 90);
        assertEquals(100, result, 0.001);
    }
    
    @Test
    public void testCase2() {
        double result = RiverCrossingControl.calcSuccessProbability(-1, 1300, 4, 10, 90);
        assertEquals(-99, result, 0.0);
    }
    
    @Test    
    public void testCase3() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1100, 4, 10, 90);
        assertEquals(-99, result, 0.0);
    }
   
    @Test
    public void testCase4() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1400, 4, 10, 90);
        assertEquals(-99, result, 0.0);
    }
        
    @Test
    public void testCase5() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 0, 10, 90);
        assertEquals(-99, result, 0.0);
    }
     
    @Test
    public void testCase6() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 6, 10, 90);
        assertEquals(-99, result, 0.0);
    }

    @Test
    public void testCase7() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 8, 90);
        assertEquals(-99, result, 0.0);
    }
        
    @Test
    public void testCase8() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 12, 90);
        assertEquals(-99, result, 0.0);
    }
        
    @Test
    public void testCase9() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 10, -1);
        assertEquals(-99, result, 0.0);
    }
        
    @Test
    public void testCase10() {
        double result = RiverCrossingControl.calcSuccessProbability(.01, 1300, 4, 10, 90);
        assertEquals(0, result, 0.001);
    }
        
    @Test
    public void testCase11() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1250, 4, 10, 90);
        assertEquals(100, result, 0.001);
    }
       
    @Test
    public void testCase12() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1350, 4, 10, 90);
        assertEquals(100, result, 0.001);
    }
        
    @Test
    public void testCase13() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 1, 10, 90);
        assertEquals(100, result, 0.001);
    }
        
    @Test
    public void testCase14() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4.75, 10, 90);
        assertEquals(0, result, 0.001);
    }
        
    @Test
    public void testCase15() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 9, 90);
        assertEquals(100, result, 0.001);
    }
        
    @Test
    public void testCase16() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 11, 90);
        assertEquals(100, result, 0.001);
    }
       
    @Test
    public void testCase17() {
        double result = RiverCrossingControl.calcSuccessProbability(1500, 1300, 4, 10, 1);
        assertEquals(0, result, 0.001);
    }
    
}
