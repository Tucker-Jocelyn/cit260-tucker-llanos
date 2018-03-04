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
public enum RandomEvents {

    Ammunition("Bonus", "finds a box of ammunition along the trail.", "ammunition", 20, 0),
    SnakeBite("Trouble", "is bitten by a snake.", "", 0, -10),
    Wagon("Bonus", "finds an abandoned wagon along the trail and acquires a spare wheel.", "spareWheel", 1, 0),
    SprainedAnkle("Trouble", "sprains their ankle.", "", 0, -5),
    Scriptures("Bonus", "has read their scriptures every day for a week.", "", 0, 10),
    Dysentery("Trouble", "contracts dysentery.", "", 0, -15),
    Strangers("Bonus", "meets strangers along the trail who share some extra food.", "food", 10, 0),
    Theft("Trouble", "is robbed by strangers along the trail.", "food", -5, -5),
    Service("Bonus", "helps strangers get their wagon out of the mud", "", 0, 10),
    Gangrene("Trouble", "contracts gangrene.", "", 0, -15),
    Blessing("Bonus", "receives a blessing and health improves.", "", 0, 10),
    Stampede("Trouble", "has to get the wagon out of the way of a buffalo stampede and looses food in the process.", "food", -10, 0),
    Plants("Bonus", "finds edible plants along the trail.", "food", 5, 0),
    Measles("Trouble", "contracts measles.", "", 0, -10),
    Prayer("Bonus", "has said prayer every morning.", "", 0, 10),
    Accident("Trouble", "breaks a wagon wheel driving over big rocks.", "spareWheel", -1, 0),
    Fhe("Bonus", "gives the lesson at FHE.", "", 0, 5);

    //class instance variables
    private String randomEventType;
    private String eventDescription;
    private String inventoryType;
    private int inventoryChange;
    private int healthChange;

    RandomEvents(String randomEventType, String eventDescription, String inventoryType, int inventoryChange, int healthChange) {
        this.randomEventType = randomEventType;
        this.eventDescription = eventDescription;
        this.inventoryType = inventoryType;
        this.inventoryChange = inventoryChange;
        this.healthChange = healthChange;
    }

    public String getRandomEventType() {
        return randomEventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public int getInventoryChange() {
        return inventoryChange;
    }

    public int getHealthChange() {
        return healthChange;
    }

    @Override
    public String toString() {
        return "RandomEvents{" + "randomEventType=" + randomEventType + ", eventDescription=" + eventDescription + ", inventoryType=" + inventoryType + ", inventoryChange=" + inventoryChange + ", healthChange=" + healthChange + '}';
    }

}
