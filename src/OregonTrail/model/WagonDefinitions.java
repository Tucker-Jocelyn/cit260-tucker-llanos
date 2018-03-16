/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

/**
 *
 * @author Jocelyn Tucker
 */
public enum WagonDefinitions {

    SMALL(1, "Small Wagon", 1250, "A small wagon weighs 1250 lbs and can carry 1800 lbs of supplies.", 60, 1800, 9),
    MEDIUM(2, "Medium Wagon", 1300, "A medium wagon weighs 1300 lbs and can carry 2000 lbs of supplies.", 70, 1300, 10),
    LARGE(3, "Large Wagon", 1350, "A large wagon weighs 1350 lbs and can carry 2200 lbs of supplies.", 80, 1350, 11);

    public final int index;
    public final String name;
    public final double wagonWeight;
    public final String description;
    public final double cost;
    public final double maxCarryWeight;
    public final int length;

    WagonDefinitions(int index, String name, int wagonWeight, String description, double cost, double maxCarryWeight, int length) {
        this.index = index;
        this.name = name;
        this.wagonWeight = wagonWeight;
        this.description = description;
        this.cost = cost;
        this.maxCarryWeight = maxCarryWeight;
        this.length = length;
    }

}
