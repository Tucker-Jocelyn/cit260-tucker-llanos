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
import OregonTrail.model.Wagon;

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
import OregonTrail.model.GeneralStoreScene;
import OregonTrail.model.RiverScene;
import OregonTrail.model.HotelScene;
import OregonTrail.model.TrailStopScene;
import OregonTrail.view.StartProgramView;


/**
 *
 * @author kim-jocelyn
 */
public class OregonTrail {
 private static Player currentPlayer = null;
 private static Game currentGame = null;

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        OregonTrail.currentPlayer = currentPlayer;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();

        startProgramView.display();
    }
}
