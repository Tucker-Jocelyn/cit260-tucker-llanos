package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\nHere are your Help Menu Options:"
                + "\nG - Game Objective\n"
                + "\nM - How to Move\n"
                + "\nT - Tips\n"
                + "\nE - Exit Help Menu (Back to Main Menu)\n"
                + "\nPlease Choose an Option:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'G':
                System.out.println("G - Displaying game objective\n");
                gameObjective();
                break;
            case 'M':
                System.out.println("M - Displaying how to move\n");
                howToMove();
                break;
            case 'T':
                System.out.println("T - Displaying tips for the game\n");
                getTips();
                break;
            case 'E':
                System.out.println("E = Exit (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"G, M, T, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void gameObjective() {
        ViewGameObjective viewGameObjective = new ViewGameObjective();
        ViewGameObjective.displayViewGameObjective();
    }

    private void howToMove() {
        ViewMoveOptions viewMoveOptions = new ViewMoveOptions();
        ViewMoveOptions.displayViewMoveOptions();
    }

    private void getTips() {
        ViewGameTips viewGameTips = new ViewGameTips();
        ViewGameTips.displayViewGameTips();
    }

}
