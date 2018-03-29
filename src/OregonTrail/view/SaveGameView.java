package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import OregonTrail.model.Game;
import exceptions.GameControlException;
import java.io.IOException;

/**
 *
 * @author kimta
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("\nSave Game Option, please enter a file path to save your game.");
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0]; //filePath = get first value in inputs array
        Game game = OregonTrail.getCurrentGame(); //game = get the currentGame in the main class
        try {
            //call the saveGame(game)control method
            GameControl gameControl = new GameControl();
            gameControl.saveGame(game, filePath);
        } catch (GameControlException | IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage()); //Print error passed with the exception

            return false; //return false to repeat the view
        }
        this.console.println(
                "Your game has been saved as " + filePath); //Print a success message indicating where the file was saved
        return true;
    }
}
