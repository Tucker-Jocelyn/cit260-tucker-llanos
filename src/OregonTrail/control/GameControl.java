/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Player;

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

    public static void createNewGame(Player currentPlayer) {
        System.out.println("Welcome! You Have Started a New Game.");
    }

}
