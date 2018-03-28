package OregonTrail.view;

import OregonTrail.control.GameControl;
import OregonTrail.model.Player;
import exceptions.GameControlException;

/**
 *
 * @author Jocelyn & Kim
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\nWelcome to the Oregon Trail. The objective of this game is travel from Nauvoo to the Salt Lake Valley."
                + "\nYou will outfit your team with supplies at the beginning of the trek."
                + "\nYou will have opportunities to shop for additional supplies at towns and forts along the way - provided you have the funds to do so."
                + "\nAlong the way you will make decisions affecting your team's health including pace of travel, and whether or not to rest."
                + "\nYou will also choose which locations to visit, and whether or not you wish to hunt and gather."
                + "\nYou may add a team member only when there is a vacancy on the team."
                + "\nEvents may happen along the way to either help or hinder your progress. "
                + "\nGood Luck!!");
    }

    @Override
    public String[] getInput() {

        boolean valid = false;
        String name = null;
        String[] inputs = new String[1];

        try {

            // while a valid input has not been retrieved
            while (valid == false) {

                this.console.println("\nPlease enter your name: ");
                // get the value entered from the keyboard
                name = this.keyboard.readLine();
                name = name.trim();

                inputs[0] = name;
                valid = true;
            }
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player = null;
        try {
            player = GameControl.savePlayer(playersName);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), "\nError saving player name. " + ex.getMessage());
        }

        if (player == null) {
            ErrorView.display(this.getClass().getName(), "\nCould not create the player. Enter a different name.");
            return false;
        }

        this.console.println(("\nWelcome to the Oregon Trail, " + playersName)
                + ("\nGood luck on your journey to the Salt Lake Valley!"));

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }

}
