/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.FortScene;
import OregonTrail.model.GeneralStoreScene;
import OregonTrail.model.HotelScene;
import OregonTrail.model.Location;
import OregonTrail.model.LocationType;
import OregonTrail.model.Map;
import OregonTrail.model.Places;
import OregonTrail.model.RegularScene;
import OregonTrail.model.RiverScene;
import OregonTrail.model.Scene;
import OregonTrail.model.SceneType;
import OregonTrail.model.TownScene;
import OregonTrail.model.TrailStopScene;

/**
 *
 * @author Jocelyn Tucker
 */
public class MapControl {

    public static Map createMap(int noOfLocations) {
        if (noOfLocations < 0) {
            return null;
        }

        Map map = new Map();
        Location[] locations = createLocations(noOfLocations);
        map.setLocations(locations);
        Scene[] scenes = createScenes();
//assignItemsToScenes() **************weather and animals/plants for our game?
        assignScenesToLocations(map, scenes);
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
            } else if (i == 5 || i == 10 || i == 21 || i == 24 || i == 60 || i == 66 || i == 75 || i == 79) {
                location.setType(LocationType.RIVER); //set the type attribute in location to river
            } else {
                location.setType(LocationType.TRAIL); //set the type attribute in location to trail
            }
            locations[i] = location; //Assign location to index in array
        }
        return locations;
    }

    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[7]; //scenes = Create an array Scene objects

        scenes[SceneType.GENERAL_STORE_SCENE.ordinal()] = new GeneralStoreScene(SceneType.GENERAL_STORE_SCENE.ordinal(), "General Store", "Buy or sell supplies for your trek to the Salt Lake Valley", Inventory ?);
// ***************still need to overload constructor to populate attributes

        scenes[SceneType.TOWN_SCENE.ordinal()] = new TownScene(SceneType.TOWN_SCENE.ordinal(), "Town", "Welcome to town! Feel free to visit the hotel or general store.");
        scenes[SceneType.REGULAR_SCENE.ordinal()] = new RegularScene(SceneType.REGULAR_SCENE.ordinal(), "Landmark", "We're sorry, there are no ammenities here.");
        scenes[SceneType.FORT_SCENE.ordinal()] = new FortScene(SceneType.FORT_SCENE.ordinal(), "Fort", "Welcome to the fort! Feel free to visit the general store.");
        scenes[SceneType.RIVER_SCENE.ordinal()] = new RiverScene(SceneType.RIVER_SCENE.ordinal(), "River", "You must decided if you want to cross the river or not.", RiverCrossingControl.getWaterDepth());
        scenes[SceneType.HOTEL_SCENE.ordinal()] = new HotelScene(SceneType.HOTEL_SCENE.ordinal(), "Hotel", "Welcome to the hotel! Feel free to add a member to your party if you have space available.");
        scenes[SceneType.TRAIL_STOP_SCENE.ordinal()] = new TrailStopScene(SceneType.TRAIL_STOP_SCENE.ordinal(), "Trail", "What would you like to do along the trail today?", SceneControl.hasNearbyTown ?, nearbyTownName ?, hasNearbyFort ?, nearbyFortName ?, SceneControl.getAnimals(), SceneControl.getPlants());
// ***************still need to overload constructor to populate attributes
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {

        Location[] location = map.getLocations();

        for (int i = 0; i < location.length; i++) { //FOR every index in the locations array
            if (i == 62 || i == 63 || i == 70 || i == 72 || i == 80) {
                location[i].setScene(scenes[SceneType.TOWN_SCENE.ordinal()]); //set the scene in location to town
                location[i].setCurrentLocation(false);
            } else if (i == 7 || i == 31 || i == 50) {
                location[i].setScene(scenes[SceneType.FORT_SCENE.ordinal()]); //set the scene in location to fort
                location[i].setCurrentLocation(false);
            } else if (i == 0 || i == 18 || i == 20 || i == 35) {
                location[i].setScene(scenes[SceneType.REGULAR_SCENE.ordinal()]); //set the scene in location to regular
                location[i].setCurrentLocation(false);
            } else if (i == 5 || i == 10 || i == 21 || i == 24 || i == 60 || i == 66 || i == 75 || i == 79) {
                location[i].setScene(scenes[SceneType.RIVER_SCENE.ordinal()]); //set the scene in location to river
                location[i].setCurrentLocation(false);
            } else {
                location[i].setScene(scenes[SceneType.TRAIL_STOP_SCENE.ordinal()]); //set the scene in location to trail stop
                location[i].setCurrentLocation(false);
            }
//********************still need to assign actual names of places and mapSymbol
            location[0].scene.setName(Places.SALT_LAKE_VALLEY.name());
            location[0].
        }
    }

}
