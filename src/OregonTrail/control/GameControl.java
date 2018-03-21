/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Character;
import OregonTrail.model.CharacterDefinitions;
import OregonTrail.model.Game;
import OregonTrail.model.Inventory;
import OregonTrail.model.Map;
import OregonTrail.model.Player;
import OregonTrail.model.Team;
import exceptions.MapControlException;
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

    public static int createNewGame(Player currentPlayer) throws MapControlException {
        if (currentPlayer == null) {
            return -1;
        }

        Game game = new Game();
        game.setPlayer(currentPlayer);
        OregonTrail.setCurrentGame(game);
        //CharacterDefinitions[] team = TeamControl.createTeam(); //**********Connor IS THIS RIGHT?  
        Team team = TeamControl.createTeam();
        game.setTeam(team);//Save the team in the Game object***************Connor
//Assign an character to the player *************Connor
        Inventory inventory = InventoryControl.createInventory();
        team.setInventory(inventory);
        int noOfLocations = 81;
        Map map = MapControl.createMap(noOfLocations);
        if (map == null) {
            return -1;
        }
        game.setMap(map);
        return 1; //indicates success
    }

    public static void determineWin() {
        System.out.println("*** determineWin() called ***");
    }

}
