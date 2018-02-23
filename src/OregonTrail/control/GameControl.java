/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Player;

/**
 *
 * @author Jocelyn Tucker and Kim
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        System.out.println("*** savePlayer() called ***");
        return new Player();
    }

  public static void createNewGame(Player player) {  
      System.out.println("Welcome! You Have Started a New Game.");
  }
    
}
