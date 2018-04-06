
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Game;
import OregonTrail.model.Inventory;
import OregonTrail.model.Map;
import OregonTrail.model.Player;
import OregonTrail.model.Team;
import exceptions.GameControlException;
import exceptions.MapControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Jocelyn Tucker and Kim Llanos
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

    public void saveGame(Game game, String filePath) throws GameControlException,
            IOException {
        if (game == null) { //if an invalid game or filePath is passed to the method then
            throw new GameControlException("Error saving game"); //throw a new GameControlException
        }
        if (filePath == null || filePath.length() < 1) {
            throw new GameControlException("File path is not valid");
        }
        try (ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream(filePath))) { //create a new FileOutputStream for the filePath
            //create a new ObjectOutputStream from the FileOutputStream
            out.writeObject(game); //write the game object to the ObjectOutputStream
        } catch (IOException ex) {
            throw ex;
        }
    }

    public Game getGame(String filePath) throws GameControlException, IOException, ClassNotFoundException {
        if (filePath == null || filePath.length() < 1) { //if the filePath is null then
            throw new GameControlException("No game to retrieve"); //throw a new GameControlException
        }
        try (ObjectInputStream in
                = new ObjectInputStream(new FileInputStream(filePath))) { //create a new FileInputStream for the filePath
            //create a new ObjectInputStream from the FileOutputStream
            Game game = (Game) in.readObject(); //game = call ObjectInputStream’s readObject() method *****Needs explicit typecasting
            OregonTrail.setCurrentGame(game); //set the currentGame attribute in the main class to the game object
            Player player = game.getPlayer();
            OregonTrail.setCurrentPlayer(player); //set the player attribute in the main class to the player object saved in the game object
            return game;
        } catch (IOException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
