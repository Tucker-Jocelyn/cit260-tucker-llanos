/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OregonTrail.model.Game;
import OregonTrail.model.Player;
import OregonTrail.model.Map;
import OregonTrail.model.Team;
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
        // TODO code application logic here
            Game gameOne = new Game();
            
            gameOne.setTeam("Newbies");
            
            String gameOneTeam = gameOne.getTeam();
            
            System.out.println(gameOne.toString());
            
            Player playerOne = new Player();
            
            playerOne.setName("Player One");
            
            String playerOneName = playerOne.getName();
            
            System.out.println(playerOne.toString());
            
            Map mapOne = new Map();
            
            mapOne.setCurrentLocation("Trail Map");
            
            String mapOneCurrentLocation = mapOne.getCurrentLocation();
            
            System.out.println(mapOne.toString());
            
            Team teamOne = new Team();
            
            teamOne.setName("Trekkies");
            
            String teamOneName = teamOne.getName();
            
            System.out.println(teamOne.toString());
            
    }
    
}
