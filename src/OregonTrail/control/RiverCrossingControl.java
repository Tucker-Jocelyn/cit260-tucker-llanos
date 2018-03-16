package OregonTrail.control;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingControl {

    public static double calcSuccessProbability(double currentWagonLoadWeight, double wagonWeight, double waterDepth, int length, int oxHealth) {

        if (currentWagonLoadWeight < 0 || wagonWeight < 1250 || wagonWeight > 1350 || waterDepth < 1
                || waterDepth > 4.75 || length < 9 || length > 11 || oxHealth < 0) {
            return -99;
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
