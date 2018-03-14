/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Location;
import OregonTrail.model.LocationType;
import OregonTrail.model.Map;
import OregonTrail.model.Scene;

/**
 *
 * @author Jocelyn Tucker
 */
public class MapControl {

    public static Map createMap(int noOfLocations) {
        if (noOfLocations < 0) {
            return null;
        }

        Map map = new Map(); //Map map = new Map object
//save the noOfRows in the map *****for us number of locations for array (81)
//save the noOfColumns in the map
        Location[] locations = createLocations(noOfLocations); //locations = createLocations(noOfRows, noOfColumns)
        map.setLocations(locations); //Assign the locations array to the map
        Scene[] scenes = createScenes(); //scenes = createScenes()
//assignItemsToScenes() **************weather for our game?
        assignScenesToLocations(scenes, locations); //assignScenesToLocations()
        return map;
    }

    public static void moveTeam() {
        System.out.println("*** moveTeam() called ***");
    }

    private static Location[] createLocations(int noOfLocations) {
        if (noOfLocations < 1) {
            return null;
        }
        Location[] locations = new Location[noOfLocations]; //    locations = new Location array
        for (int i = 0; i < locations.length; i++) { //FOR every index in the locations array
            Location location = new Location(); //location = create a new Location object
            if (i == 62 || i == 63 || i == 70 || i == 72 || i == 80) {
                location.setType(LocationType.TOWN); //set the type attribute in location to town
            } else if (i == 7 || i == 31 || i == 50) {
                location.setType(LocationType.FORT); //set the type attribute in location to fort
            } else if (i == 0 || i == 18 || i == 20 || i == 35) {
                location.setType(LocationType.LANDMARK); //set the type attribute in location to landmark
            } else {
                location.setType(LocationType.TRAIL); //set the type attribute in location to trail
            }
            locations[i] = location; //Assign location to index in array
        }
        return locations;
    }

    private static Scene[] createScenes() {
        System.out.println("*** createScenes() called ***");
        return scenes;
    }

    private static void assignScenesToLocations(Scene[] scenes, Location[] locations) {
        System.out.println("*** assignScenesToLocations() called ***");
    }

}
