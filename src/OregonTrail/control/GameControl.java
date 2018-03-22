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
import exceptions.GameControlException;
import exceptions.MapControlException;
import java.util.ArrayList;

/**
 *
 * @author Jocelyn Tucker and Kim
 */
public class GameControl {

    public static Player savePlayer(String playersName) throws GameControlException {
        if (playersName == null || playersName.length() < 1) {
            //return null;
            throw new GameControlException("The player's name cannot be empty.");
        }

        Player player = new Player();
        player.setName(playersName);
        OregonTrail.setCurrentPlayer(player);
        return player;
    }

    public static int createNewGame(Player currentPlayer) throws MapControlException, GameControlException {
        if (currentPlayer == null) {
            //return -1;
            throw new GameControlException("No player is associated with the game, please sign up!");
        }

        Game game = new Game();
        game.setPlayer(currentPlayer);
        OregonTrail.setCurrentGame(game);
        Team team = TeamControl.createTeam();
        game.setTeam(team);
        Inventory inventory = InventoryControl.createInventory();
        team.setInventory(inventory);
        int noOfLocations = 81;
        Map map = MapControl.createMap(noOfLocations);
        if (map == null) {
            //return -1;
            throw new GameControlException("Could not create a map.");
        }
        game.setMap(map);
        return 1; //indicates success
    }

    public static void determineWin() {
        System.out.println("*** determineWin() called ***");
    }

}
