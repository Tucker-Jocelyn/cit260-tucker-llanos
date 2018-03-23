package OregonTrail.control;

import exceptions.RiverCrossingControlException;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingControl {

    public static double calcSuccessProbability(double currentWagonLoadWeight, double wagonWeight, double waterDepth, int length, int oxHealth) throws RiverCrossingControlException {

        if (currentWagonLoadWeight < 0) {
            throw new RiverCrossingControlException("Wagon load weight cannot be less than 0");
        }
        if (wagonWeight < 1250) {
            throw new RiverCrossingControlException("Wagon weight cannot be less than 1250");
        }
        if (wagonWeight > 1350) {
            throw new RiverCrossingControlException("Wagon weight cannot be greater than 1350");
        }
        if (waterDepth < 1) {
            throw new RiverCrossingControlException("Water depth cannot be less than 1");
        }
        if (waterDepth > 4.75) {
            throw new RiverCrossingControlException("Water depth cannot be greater than 4.75");
        }
        if (length < 9) {
            throw new RiverCrossingControlException("Wagon length cannot be less than 9");
        }
        if (length > 11) {
            throw new RiverCrossingControlException("Wagon length cannot be greater than 11");
        }
        if (oxHealth < 0) {
            throw new RiverCrossingControlException("Ox health cannot be less than 0");
        }
        if (oxHealth > 100) {
            throw new RiverCrossingControlException("Ox health cannot be greater than 100");
        }

        double percentSuccess = 0;
        double totalWagonWeight = currentWagonLoadWeight + wagonWeight; //pushing the wagon down

        if (waterDepth * 12 < 40) {  //convert water depth in feet to inches; wagon clearance is 40"
            percentSuccess = 100;
            return percentSuccess;
        }

        double netWaterDepth = ((waterDepth * 12) - 40) / 12;  //depth in inches of water above 40" clearance converted to feet
        double buoyancy = (length * 4) * netWaterDepth * 62.4;  //4 is width of wagon; 62.4 is weight of water in lbs/cubic foot (displaced water) - force pushing the wagon up

        if (buoyancy >= totalWagonWeight) {  //wagon floats away
            percentSuccess = 0;
            return percentSuccess;
        }

        double frictionForceCoefficient = 0;  //friction force coefficient is friction of wheels & oxen hooves on river bottom

        if (oxHealth >= 75) {
            frictionForceCoefficient = .4;
        }

        if (oxHealth >= 50 && oxHealth < 75) {
            frictionForceCoefficient = .3;
        }

        if (oxHealth < 50) {
            frictionForceCoefficient = .2;
        }

        double frictionForce = frictionForceCoefficient * (totalWagonWeight - buoyancy);  //force keeping the wagon in place
        double waterForce = (length * netWaterDepth) * 1.4 * 36;  //1.4 is constant for square-cornered objects; 36 is velocity squared (set at 6 ft/sec because it wasn't specified in end user stories) - force pushin against the side of the wagon

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

    static double getWaterDepth() {
        System.out.println("*** getWaterDepth() called *** returning filler number");
        return 1;
    }
}
