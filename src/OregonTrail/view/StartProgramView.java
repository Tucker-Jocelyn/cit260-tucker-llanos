package OregonTrail.view;

import OregonTrail.control.GameControl;
import OregonTrail.model.Player;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {
            System.out.println("\nPlease enter your name: ");
            String name = in.nextLine();

            name = name.trim();

            if (name.length() < 1) {
                System.out.println("You must enter a value, blanks are not accepted here.");

                continue;
            }

            inputs[0] = name;
            valid = true;

        }
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);

        if (player == null) {
            System.out.println("\nCould not create the player. Enter a different name.");
            return false;
        }

        System.out.println(("\nWelcome to the Oregon Trail, " + playersName)
                + ("\nGood luck on your journey to the Salt Lake Valley!"));

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }

}
