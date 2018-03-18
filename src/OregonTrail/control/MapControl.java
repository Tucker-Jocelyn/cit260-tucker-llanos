/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
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
        assignScenesToLocations(map, scenes);
        locations[0].setName(Places.SALT_LAKE_VALLEY.name);
        locations[0].setMapSymbol(Places.SALT_LAKE_VALLEY.mapSymbol);

        locations[5].setName(Places.BEAR_RIVER.name);
        locations[5].setMapSymbol(Places.BEAR_RIVER.mapSymbol);

        locations[7].setName(Places.FORT_BRIDGER.name);
        locations[7].setMapSymbol(Places.FORT_BRIDGER.mapSymbol);

        locations[10].setName(Places.GREEN_RIVER.name);
        locations[10].setMapSymbol(Places.GREEN_RIVER.mapSymbol);

        locations[18].setName(Places.MARTINS_COVE.name);
        locations[18].setMapSymbol(Places.MARTINS_COVE.mapSymbol);

        locations[20].setName(Places.INDEPENDENCE_ROCK.name);
        locations[20].setMapSymbol(Places.INDEPENDENCE_ROCK.mapSymbol);

        locations[21].setName(Places.SWEETWATER_RIVER.name);
        locations[21].setMapSymbol(Places.SWEETWATER_RIVER.mapSymbol);

        locations[24].setName(Places.UPPER_PLATTE_RIVER.name);
        locations[24].setMapSymbol(Places.UPPER_PLATTE_RIVER.mapSymbol);

        locations[31].setName(Places.FORT_LARAMIE.name);
        locations[31].setMapSymbol(Places.FORT_LARAMIE.mapSymbol);

        locations[35].setName(Places.CHIMNEY_ROCK.name);
        locations[35].setMapSymbol(Places.CHIMNEY_ROCK.mapSymbol);

        locations[50].setName(Places.FORT_KEARNEY.name);
        locations[50].setMapSymbol(Places.FORT_KEARNEY.mapSymbol);

        locations[60].setName(Places.PLATTE_RIVER.name);
        locations[60].setMapSymbol(Places.PLATTE_RIVER.mapSymbol);

        locations[62].setName(Places.WINTER_QUARTERS.name);
        locations[62].setMapSymbol(Places.WINTER_QUARTERS.mapSymbol);

        locations[63].setName(Places.KANESVILLE.name);
        locations[63].setMapSymbol(Places.KANESVILLE.mapSymbol);

        locations[66].setName(Places.NISHNABOTNA_RIVER.name);
        locations[66].setMapSymbol(Places.NISHNABOTNA_RIVER.mapSymbol);

        locations[70].setName(Places.MOUNT_PISGAH.name);
        locations[70].setMapSymbol(Places.MOUNT_PISGAH.mapSymbol);

        locations[72].setName(Places.GARDEN_GROVE.name);
        locations[72].setMapSymbol(Places.GARDEN_GROVE.mapSymbol);

        locations[75].setName(Places.CHARITON_RIVER.name);
        locations[75].setMapSymbol(Places.CHARITON_RIVER.mapSymbol);

        locations[79].setName(Places.MISSISSIPPI_RIVER.name);
        locations[79].setMapSymbol(Places.MISSISSIPPI_RIVER.mapSymbol);

        locations[80].setName(Places.NAUVOO.name);
        locations[80].setMapSymbol(Places.NAUVOO.mapSymbol);
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

        scenes[SceneType.GENERAL_STORE_SCENE.ordinal()] = new GeneralStoreScene(SceneType.GENERAL_STORE_SCENE.ordinal(), "General Store", "Buy or sell supplies for your trek to the Salt Lake Valley");
        scenes[SceneType.TOWN_SCENE.ordinal()] = new TownScene(SceneType.TOWN_SCENE.ordinal(), "Welcome to town! Feel free to visit the hotel or general store.");
        scenes[SceneType.REGULAR_SCENE.ordinal()] = new RegularScene(SceneType.REGULAR_SCENE.ordinal(), "We're sorry, there are no ammenities here.");
        scenes[SceneType.FORT_SCENE.ordinal()] = new FortScene(SceneType.FORT_SCENE.ordinal(), "Welcome to the fort! Feel free to visit the general store.");
        scenes[SceneType.RIVER_SCENE.ordinal()] = new RiverScene(SceneType.RIVER_SCENE.ordinal(), "You must decided if you want to cross the river or not.", RiverCrossingControl.getWaterDepth());
        scenes[SceneType.HOTEL_SCENE.ordinal()] = new HotelScene(SceneType.HOTEL_SCENE.ordinal(), "Hotel", "Welcome to the hotel! Feel free to add a member to your party if you have space available.");
        scenes[SceneType.TRAIL_STOP_SCENE.ordinal()] = new TrailStopScene(SceneType.TRAIL_STOP_SCENE.ordinal(), "Trail", "What would you like to do along the trail today?", SceneControl.getAnimals(), SceneControl.getPlants());

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
                location[i].setMapSymbol("-");
            }

        }
    }

    public static void listLocations() {
        Location[] locations = OregonTrail.getCurrentGame().getMap().getLocations();
       // System.out.println(locations[20].getScene().getName());
        
        System.out.println("Towns:");
        for (Location current : locations) {
            if (current.type == LocationType.TOWN) {
                System.out.println(current.getName());
            }
        }
        System.out.println("\nForts:");
        for (Location current : locations) {
            if (current.type == LocationType.FORT) {
                System.out.println(current.getName());
            }
        }
        System.out.println("\nLandmarks:");
        for (Location current : locations) {
            if (current.type == LocationType.LANDMARK) {
                System.out.println(current.getName());
            }
        }
        System.out.println("\nRivers:");
        for (Location current : locations) {
            if (current.type == LocationType.RIVER) {
                System.out.println(current.getName());
            }

        }

    }

}
