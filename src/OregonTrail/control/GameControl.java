/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Character;
import OregonTrail.model.Game;
import OregonTrail.model.Inventory;
import OregonTrail.model.Map;
import OregonTrail.model.Player;
import OregonTrail.model.Team;
import java.util.ArrayList;

/**
 *
 * @author Jocelyn Tucker and Kim
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        if (playersName == null || playersName.length() < 1) {
            return null;
        }

        Player player = new Player();
        player.setName(playersName);
        OregonTrail.setCurrentPlayer(player);
        return player;
    }

    public static int createNewGame(Player currentPlayer) {
        if (currentPlayer == null) {
            return -1;
        }

        Game game = new Game(); //game = create a new Game object
        game.setPlayer(currentPlayer); //Save a reference to the Player object in the game
        OregonTrail.setCurrentGame(game); //Save a reference to the game in the main class
        ArrayList<Team> team = new ArrayList<>(); //create team object arrayList
        //team = team.getTeamMembers(); //actors = createActors() populating the team with characters*************Connor
        //game.setTeam(teamMembers);//Save the list of actors in the Game object***************Connor
//Assign an actor to the player *************Connor
        Inventory inventory = InventoryControl.createInventory(); //items = createItems() IS THIS LINE RIGHT? Also, should it be in inventory or game control?  *********** our inventory is connected to team not game*
//Save the list of items in the game ****************Connor
        int noOfLocations = 81;
        Map map = MapControl.createMap(noOfLocations); //map = createMap(noOfRows, noOfColumns, items) IS THIS LINE RIGHT?
        if (map == null) {
            return -1;
        }
        game.setMap(map); //Assign the map to the game ***************Connor
        return 1; //indicates success
    }

    public static void determineWin() {
        System.out.println("*** determineWin() called ***");
    }

}
