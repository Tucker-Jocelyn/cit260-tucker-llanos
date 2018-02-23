/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OregonTrail.model.Player;

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
            Player playerOne = new Player();
            
            playerOne.setName("Player One");
            
            String playerOneName = playerOne.getName();
            
            System.out.println(playerOne.toString());
    }
    
}
