/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingControl {
    
public static double calcSuccessProbability(double currentWagonLoadWeight, double wagonWeight, double waterDepth, int length, int oxHealth) {

	if (currentWagonLoadWeight < 0 || wagonWeight < 1250 || wagonWeight > 1350 || waterDepth < 1 || 
            waterDepth > 4.75 || length < 9 || length > 11 || oxHealth < 0) {
            return -99;
	}
	
        double percentSuccess = 0;
	double totalWagonWeight = currentWagonLoadWeight + wagonWeight;
	
	if (waterDepth * 12 < 40) {  //convert water depth in feet to inches; wagon clearance is 40"
            percentSuccess = 100;
            return percentSuccess;
        }

        double netWaterDepth = ((waterDepth * 12) - 40)/12;  //depth in inches of water above 40" clearance converted to feet
	double buoyancy = (length * 4) * netWaterDepth * 62.4;  //4 is width of wagon; 62.4 is weight of water in lbs/cubic foot (displaced water)
		
	if (buoyancy >= totalWagonWeight) {  //wagon floats away
            percentSuccess = 0;
            return percentSuccess;
        }
        
        double frictionForceCoefficient = 0;
        
	if (oxHealth >= 75) {
            frictionForceCoefficient = .4;  //friction force coefficient is friction of wheels & oxen hooves on river bottom
        }
        
        if (oxHealth >= 50 && oxHealth < 75) {
            frictionForceCoefficient = .3;
	}
		
        if (oxHealth < 50) {
            frictionForceCoefficient = .2;
	}
		
	double frictionForce = frictionForceCoefficient * (totalWagonWeight - buoyancy);  
	double waterForce = (length * netWaterDepth) * 1.4 * 36;  //1.4 is constant for square-cornered objects; 36 is velocity squared (set at 6 ft/sec because it wasn't specified in end user stories)
	
	if (frictionForce > waterForce) {
            percentSuccess = 100;
	}
		
        if (frictionForce == waterForce) {
            percentSuccess = 50;
	}
		
	if (frictionForce < waterForce) {
            percentSuccess = 0;
	}
	
        return percentSuccess;
    }
}
