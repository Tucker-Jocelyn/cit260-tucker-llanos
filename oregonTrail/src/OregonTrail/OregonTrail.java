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
import java.util.Objects;

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
                    
            System.out.println(gameOne.toString());
            
            //Player Class
            Player playerOne = new Player();
            
            playerOne.setName("Player One");
                                        
            System.out.println(playerOne.toString());
            
            //Map Class
            Map mapOne = new Map();
            
            mapOne.setCurrentLocation("Trail Map");
            
            System.out.println(mapOne.toString());
            
            //Team Class
            Team teamOne = new Team();
            
            teamOne.setName("Trekkies");
            teamOne.setStatus("Good");
            teamOne.setSupplies("1 wagon, 6 oxen, 1500 pounds food");
            teamOne.setPace("Average");
            teamOne.setMembers(3);
            teamOne.setDistanceTraveled("A really long way");
            teamOne.setLivestock("Yep, you've got them all");
            
            System.out.println(teamOne.toString());
            
            //AnimalsPlants Class
            AnimalsPlants testAnimals = new AnimalsPlants();
            
            testAnimals.setType("Animal");
            testAnimals.setWeight(15);
            
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
            
            System.out.println(ox.toString());
            
            //InventoryWagon Class
            InventoryWagon wagonLarge = new InventoryWagon();
            
            wagonLarge.setCarryWeight(3000);
            wagonLarge.setLength(14);
            
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
            RandomEvents.Ammunition.getEventType();
            RandomEvents.Ammunition.getEventDescription();
            RandomEvents.Ammunition.getInventoryType();
            RandomEvents.Ammunition.getInventoryChange();
            RandomEvents.Ammunition.getHealthChange();
            RandomEvents.SnakeBite.getEventType();
            RandomEvents.SnakeBite.getEventDescription();
            RandomEvents.SnakeBite.getInventoryType();
            RandomEvents.SnakeBite.getInventoryChange();
            RandomEvents.SnakeBite.getHealthChange();
            RandomEvents.Wagon.getEventType();
            RandomEvents.Wagon.getEventDescription();
            RandomEvents.Wagon.getInventoryType();
            RandomEvents.Wagon.getInventoryChange();
            RandomEvents.Wagon.getHealthChange();
            RandomEvents.SprainedAnkle.getEventType();
            RandomEvents.SprainedAnkle.getEventDescription();
            RandomEvents.SprainedAnkle.getInventoryType();
            RandomEvents.SprainedAnkle.getInventoryChange();
            RandomEvents.SprainedAnkle.getHealthChange();
            RandomEvents.Scriptures.getEventType();
            RandomEvents.Scriptures.getEventDescription();
            RandomEvents.Scriptures.getInventoryType();
            RandomEvents.Scriptures.getInventoryChange();
            RandomEvents.Scriptures.getHealthChange();
            RandomEvents.Dysentery.getEventType();
            RandomEvents.Dysentery.getEventDescription();
            RandomEvents.Dysentery.getInventoryType();
            RandomEvents.Dysentery.getInventoryChange();
            RandomEvents.Dysentery.getHealthChange();
            RandomEvents.Strangers.getEventType();
            RandomEvents.Strangers.getEventDescription();
            RandomEvents.Strangers.getInventoryType();
            RandomEvents.Strangers.getInventoryChange();
            RandomEvents.Strangers.getHealthChange();
            RandomEvents.Theft.getEventType();
            RandomEvents.Theft.getEventDescription();
            RandomEvents.Theft.getInventoryType();
            RandomEvents.Theft.getInventoryChange();
            RandomEvents.Theft.getHealthChange();
            RandomEvents.Service.getEventType();
            RandomEvents.Service.getEventDescription();
            RandomEvents.Service.getInventoryType();
            RandomEvents.Service.getInventoryChange();
            RandomEvents.Service.getHealthChange();
            RandomEvents.Gangrene.getEventType();
            RandomEvents.Gangrene.getEventDescription();
            RandomEvents.Gangrene.getInventoryType();
            RandomEvents.Gangrene.getInventoryChange();
            RandomEvents.Gangrene.getHealthChange();
            RandomEvents.Blessing.getEventType();
            RandomEvents.Blessing.getEventDescription();
            RandomEvents.Blessing.getInventoryType();
            RandomEvents.Blessing.getInventoryChange();
            RandomEvents.Blessing.getHealthChange();
            RandomEvents.Stampede.getEventType();
            RandomEvents.Stampede.getEventDescription();
            RandomEvents.Stampede.getInventoryType();
            RandomEvents.Stampede.getInventoryChange();
            RandomEvents.Stampede.getHealthChange();
            RandomEvents.Plants.getEventType();
            RandomEvents.Plants.getEventDescription();
            RandomEvents.Plants.getInventoryType();
            RandomEvents.Plants.getInventoryChange();
            RandomEvents.Plants.getHealthChange();
            RandomEvents.Measles.getEventType();
            RandomEvents.Measles.getEventDescription();
            RandomEvents.Measles.getInventoryType();
            RandomEvents.Measles.getInventoryChange();
            RandomEvents.Measles.getHealthChange();
            RandomEvents.Prayer.getEventType();
            RandomEvents.Prayer.getEventDescription();
            RandomEvents.Prayer.getInventoryType();
            RandomEvents.Prayer.getInventoryChange();
            RandomEvents.Prayer.getHealthChange();
            RandomEvents.Accident.getEventType();
            RandomEvents.Accident.getEventDescription();
            RandomEvents.Accident.getInventoryType();
            RandomEvents.Accident.getInventoryChange();
            RandomEvents.Accident.getHealthChange();
            RandomEvents.Fhe.getEventType();
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
