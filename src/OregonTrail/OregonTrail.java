/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OregonTrail.model.AnimalsPlants;
import OregonTrail.model.CurrentDate;
import OregonTrail.model.EventGenerator;
import OregonTrail.model.Game;
import OregonTrail.model.InventoryItem;
import OregonTrail.model.InventoryOx;
import OregonTrail.model.InventoryWagon;
import OregonTrail.model.LandmarkType;
import OregonTrail.model.Player;
import OregonTrail.model.Map;
import OregonTrail.model.Money;
import OregonTrail.model.RandomEvents;
import OregonTrail.model.Team;
import OregonTrail.model.Weather;
import OregonTrail.model.Character;
import OregonTrail.model.Location;
import OregonTrail.model.Scene;
import OregonTrail.model.TownScene;
import OregonTrail.model.RegularScene;
import OregonTrail.model.FortScene;
import OregonTrail.model.RiverScene;
import OregonTrail.model.HotelScene;
import OregonTrail.model.TrailStopScene;


/**
 *
 * @author kim-jocelyn
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Game Class
            Game gameOne = new Game();
            
            gameOne.setTeam("Newbies");
            gameOne.setMap("First Map");
            gameOne.setTotalDistanceTraveled(5000);
            gameOne.setDate("Wed, Sept 21, 1890");   
            gameOne.setMilesToSLC(5000);
            
            System.out.println(gameOne.toString());
            
            //Player Class
            Player playerOne = new Player(); 
            
            playerOne.setName("Player One");
            
            System.out.println(playerOne.toString());
            
            //Map Class (kim)
            Map mapOne = new Map();
            
            mapOne.setCurrentLocation("Trail Map");
            mapOne.setMilePost(350);
            
            System.out.println(mapOne.toString());
            
            
            //Team Class (kim)
            Team teamOne = new Team();
          
            teamOne.setName("Trekkies");
            teamOne.setStatus("Good");
            teamOne.setTeamAllResources("1 wagon, 6 oxen, 1500 pounds food, 15 lbs of gathered plants, 40 lbs of hunted animals, $50");
            teamOne.setPace("Average");
            teamOne.setMembers(3);
            teamOne.setDailyDistanceTraveled("A really long way today");
            teamOne.setLivestock("Yep, you've got them all");
            teamOne.setTeamInventoryResource("2 Oxen, 3 canned beans, 1 spare wagon wheel");
            teamOne.setTeamAllSkillLevel(10);
            teamOne.setTeamHuntingSkillLevel(5);
            teamOne.setTeamGatheringSkillLevel(5);
            teamOne.setTeamRest(true);
            teamOne.setTeamAnimalWeight(45);
            teamOne.setTeamPlantWeight(30);
            teamOne.setCurrentWagonLoadWeight (1500);
            
            
            System.out.println(teamOne.toString());
            
            
            //Character Class (kim)
            Character characterOne = new Character();
            
            characterOne.setCharacterName("Character One");
            characterOne.setStamina(1);
            characterOne.setCharacterHuntingSkill(5);
            characterOne.setCharacterGatheringSkill(5);
            characterOne.setAvailability(1);
            characterOne.setCharacterHealth(1.0);
            characterOne.setMoney(1000);
            characterOne.setCharacterFood(25.5);
            characterOne.setAvailability(3);
            
            System.out.println(characterOne.toString());
            
            
            //Scene Class (kim)
            Scene sceneOne = new Scene();
            
            sceneOne.setSceneType(1);
            sceneOne.setName("First Scene");
            sceneOne.setDescription("Scene One");
            sceneOne.setLandmarkName("Chimney Rock");
            sceneOne.setHasAnimal(12);
            sceneOne.setHasPlant(8);
            
            System.out.println(sceneOne.toString());
            
            
            //Location Class (kim)
            Location locationOne = new Location();
            
            locationOne.setName("First Location");
            locationOne.setDescription("Location One");
            locationOne.setScene("Scene One");
            
            System.out.println(locationOne.toString());
            
            
            //HotelScene Class (kim)
            HotelScene hotelSceneOne = new HotelScene();
            
            hotelSceneOne.setDescription("Hotel Scene One");
            
            System.out.println(hotelSceneOne.toString());
            
            
            //TownScene Class (kim)
            TownScene townSceneOne = new TownScene();
            
            townSceneOne.setDescription("Town Scene One");
            
            System.out.println(townSceneOne.toString());
            

            //RegularScene Class (kim)
            RegularScene regularSceneOne = new RegularScene();
            
            regularSceneOne.setDescription("Regular Scene One");
            
            System.out.println(regularSceneOne.toString());
            
            
            //FortScene Class (kim)
            FortScene fortSceneOne = new FortScene();
            
            fortSceneOne.setDescription("Fort Scene One");
            
            System.out.println(fortSceneOne.toString());
            
            
            //RiverScene Class (kim
            RiverScene riverSceneOne = new RiverScene();
            
            riverSceneOne.setDescription("River Scene One");
            riverSceneOne.setWaterDepth(4);
            
            System.out.println(riverSceneOne.toString());
            
            
            //TrailStopScene Class (kim)
            TrailStopScene trailStopSceneOne = new TrailStopScene();
            
            trailStopSceneOne.setHasNearbyTown("Yes");
            trailStopSceneOne.setNearbyTownName("Nauvoo");
            trailStopSceneOne.setHasNearbyFort("Yes");
            trailStopSceneOne.setNearbyFortName("First Fort");
            
            System.out.println(trailStopSceneOne.toString());
            

            
            //AnimalsPlants Class
            AnimalsPlants testAnimals = new AnimalsPlants();
            
            testAnimals.setAnimalPlantType("Animal");
            testAnimals.setAnimalPlantWeight(15);
            
            System.out.println(testAnimals.toString());
            
            //CurrentDate Class
            CurrentDate today = new CurrentDate();
            
            today.setDate(10);
            today.setDayOfWeek("Friday");
            
            System.out.println(today.toString());
            
            //EventGenerator Class
            EventGenerator events = new EventGenerator();
            
            events.setEvent(13);
            events.setCharacter("Red Shirt");
            
            System.out.println(events.toString());
            
            //GeneralStoreScene
           // GeneralStoreScene store = new GeneralStoreScene();
            
            //store.setItem(13);
            
            //System.out.println(store.toString());
                        
            //InventoryItem Class
            InventoryItem stuff = new InventoryItem();
            
            stuff.setInventoryType("Lots and lots of stuff");
            stuff.setInventoryAmount(50);
            stuff.setItemWeight(3000);
            stuff.setInventoryDescription("All the stuff we need and want for our crazy long trip");
            stuff.setInventoryCost(10000);
            
            System.out.println(stuff.toString());
            
            //InventoryOx Class
            InventoryOx ox = new InventoryOx();
            
            ox.setPosition(3);
            ox.setPullWeight(600);
            ox.setOxHealth(90);
            ox.setOxRest(true);
            
            System.out.println(ox.toString());
            
            //InventoryWagon Class
            InventoryWagon wagonLarge = new InventoryWagon();
            
            wagonLarge.setMaxCarryWeight(3000);
            wagonLarge.setLength(14);
            wagonLarge.setWagonWeight(1300);
            
            System.out.println(wagonLarge.toString());
                       
            //Money Class
            Money dough = new Money();
            
            dough.setTeamTotal(60000);
            
            System.out.println(dough.toString());
             
            //Weather Class
            Weather outside = new Weather();
            
            outside.setWeatherType("hurricane");
            outside.setWeatherValue(-10);
            
            System.out.println(outside.toString());
            
            //LandmarkType Enum
            LandmarkType.Nauvoo.getLandmarkName();
            LandmarkType.ChimmneyRock.getLandmarkName();
            LandmarkType.IndependenceRock.getLandmarkName();
            LandmarkType.MartinsCove.getLandmarkName();
            LandmarkType.SaltLakeValley.getLandmarkName();
            
            System.out.println(LandmarkType.Nauvoo.toString());
            System.out.println(LandmarkType.ChimmneyRock.toString());
            System.out.println(LandmarkType.IndependenceRock.toString());
            System.out.println(LandmarkType.MartinsCove.toString());
            System.out.println(LandmarkType.SaltLakeValley.toString());
                        
            //RandomEvents Enum
            RandomEvents.Ammunition.getRandomEventType();
            RandomEvents.Ammunition.getEventDescription();
            RandomEvents.Ammunition.getInventoryType();
            RandomEvents.Ammunition.getInventoryChange();
            RandomEvents.Ammunition.getHealthChange();
            RandomEvents.SnakeBite.getRandomEventType();
            RandomEvents.SnakeBite.getEventDescription();
            RandomEvents.SnakeBite.getInventoryType();
            RandomEvents.SnakeBite.getInventoryChange();
            RandomEvents.SnakeBite.getHealthChange();
            RandomEvents.Wagon.getRandomEventType();
            RandomEvents.Wagon.getEventDescription();
            RandomEvents.Wagon.getInventoryType();
            RandomEvents.Wagon.getInventoryChange();
            RandomEvents.Wagon.getHealthChange();
            RandomEvents.SprainedAnkle.getRandomEventType();
            RandomEvents.SprainedAnkle.getEventDescription();
            RandomEvents.SprainedAnkle.getInventoryType();
            RandomEvents.SprainedAnkle.getInventoryChange();
            RandomEvents.SprainedAnkle.getHealthChange();
            RandomEvents.Scriptures.getRandomEventType();
            RandomEvents.Scriptures.getEventDescription();
            RandomEvents.Scriptures.getInventoryType();
            RandomEvents.Scriptures.getInventoryChange();
            RandomEvents.Scriptures.getHealthChange();
            RandomEvents.Dysentery.getRandomEventType();
            RandomEvents.Dysentery.getEventDescription();
            RandomEvents.Dysentery.getInventoryType();
            RandomEvents.Dysentery.getInventoryChange();
            RandomEvents.Dysentery.getHealthChange();
            RandomEvents.Strangers.getRandomEventType();
            RandomEvents.Strangers.getEventDescription();
            RandomEvents.Strangers.getInventoryType();
            RandomEvents.Strangers.getInventoryChange();
            RandomEvents.Strangers.getHealthChange();
            RandomEvents.Theft.getRandomEventType();
            RandomEvents.Theft.getEventDescription();
            RandomEvents.Theft.getInventoryType();
            RandomEvents.Theft.getInventoryChange();
            RandomEvents.Theft.getHealthChange();
            RandomEvents.Service.getRandomEventType();
            RandomEvents.Service.getEventDescription();
            RandomEvents.Service.getInventoryType();
            RandomEvents.Service.getInventoryChange();
            RandomEvents.Service.getHealthChange();
            RandomEvents.Gangrene.getRandomEventType();
            RandomEvents.Gangrene.getEventDescription();
            RandomEvents.Gangrene.getInventoryType();
            RandomEvents.Gangrene.getInventoryChange();
            RandomEvents.Gangrene.getHealthChange();
            RandomEvents.Blessing.getRandomEventType();
            RandomEvents.Blessing.getEventDescription();
            RandomEvents.Blessing.getInventoryType();
            RandomEvents.Blessing.getInventoryChange();
            RandomEvents.Blessing.getHealthChange();
            RandomEvents.Stampede.getRandomEventType();
            RandomEvents.Stampede.getEventDescription();
            RandomEvents.Stampede.getInventoryType();
            RandomEvents.Stampede.getInventoryChange();
            RandomEvents.Stampede.getHealthChange();
            RandomEvents.Plants.getRandomEventType();
            RandomEvents.Plants.getEventDescription();
            RandomEvents.Plants.getInventoryType();
            RandomEvents.Plants.getInventoryChange();
            RandomEvents.Plants.getHealthChange();
            RandomEvents.Measles.getRandomEventType();
            RandomEvents.Measles.getEventDescription();
            RandomEvents.Measles.getInventoryType();
            RandomEvents.Measles.getInventoryChange();
            RandomEvents.Measles.getHealthChange();
            RandomEvents.Prayer.getRandomEventType();
            RandomEvents.Prayer.getEventDescription();
            RandomEvents.Prayer.getInventoryType();
            RandomEvents.Prayer.getInventoryChange();
            RandomEvents.Prayer.getHealthChange();
            RandomEvents.Accident.getRandomEventType();
            RandomEvents.Accident.getEventDescription();
            RandomEvents.Accident.getInventoryType();
            RandomEvents.Accident.getInventoryChange();
            RandomEvents.Accident.getHealthChange();
            RandomEvents.Fhe.getRandomEventType();
            RandomEvents.Fhe.getEventDescription();
            RandomEvents.Fhe.getInventoryType();
            RandomEvents.Fhe.getInventoryChange();
            RandomEvents.Fhe.getHealthChange();
            
            System.out.println(RandomEvents.Ammunition.toString());
            System.out.println(RandomEvents.SnakeBite.toString());
            System.out.println(RandomEvents.Wagon.toString());
            System.out.println(RandomEvents.SprainedAnkle.toString());
            System.out.println(RandomEvents.Scriptures.toString());
            System.out.println(RandomEvents.Dysentery.toString());
            System.out.println(RandomEvents.Strangers.toString());
            System.out.println(RandomEvents.Theft.toString());
            System.out.println(RandomEvents.Service.toString());
            System.out.println(RandomEvents.Gangrene.toString());
            System.out.println(RandomEvents.Blessing.toString());
            System.out.println(RandomEvents.Stampede.toString());
            System.out.println(RandomEvents.Plants.toString());
            System.out.println(RandomEvents.Measles.toString());
            System.out.println(RandomEvents.Prayer.toString());
            System.out.println(RandomEvents.Accident.toString());
            System.out.println(RandomEvents.Fhe.toString());           
    }
}

