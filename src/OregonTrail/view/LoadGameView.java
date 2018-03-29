package OregonTrail.view;

import OregonTrail.control.GameControl;
import exceptions.GameControlException;
import java.io.IOException;

/**
 *
 * @author kimta
 */
public class LoadGameView extends View {

    public LoadGameView() {
        super("\nLoad Game Option -  please enter the game to retrieve:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0]; //filePath = get first value in inputs array
        try {
            GameControl gameControl = new GameControl();
            gameControl.getGame(filePath); //call the getGame() control method
        } catch (GameControlException | IOException | ClassNotFoundException ex) { // catch GameControlException
            ErrorView.display(this.getClass().getName(), ex.getMessage()); //Print error passed with the exception
            return false; //return false to repeat the view
        }
        GameMenuView gameMenuView = new GameMenuView(); //gameMenuView = Create a new GameMenuView object
        gameMenuView.display(); //display the gameMenuView
        return true; //return true to end the view
    }
}
