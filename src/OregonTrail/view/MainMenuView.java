/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Jocelyn and Kim
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\nHere are your Game Play Options:"
                + "\nN - Start new game\n"
                + "\nR - Restart existing game\n"
                + "\nH - Get help on how to play the game\n"
                + "\nP - Set the Team Pace\n"
                + "\nG - General Store Menu\n"
                + "\nS - Save game\n"
                + "\nE - Exit the Game");
    }

    //logic for lines 31-82 now in the super class
    /*
    void displayMainMenuView() {

        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();

            //check input length
            if (inputs.length < 1) {
                return;
            }

            endOfView = doAction(inputs);

        } while (endOfView != true);

    }
     */
 /*
    private String[] getInputs() {
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];

        System.out.println("\nHere are your Game Play Options:"
                + "\nN - Start new game\n"
                + "\nR - Restart existing game\n"
                + "\nH - Get help on how to play the game\n"
                + "\nP - Set the Team Pace\n"
                + "\nG - General Store Menu\n"
                + "\nS - Save game\n"
                + "\nE - Exit");

        boolean valid = false;

        while (valid == false) {

            System.out.println("\nPlease Choose an Option");
            String option = in.nextLine();

            option = option.trim();

            if (option.length() < 1) {
                System.out.println("You must enter a value, blanks are not accepted here.");

                continue;
            }

            inputs[0] = option;
            valid = true;

        }
        return inputs;

    }
     */
    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'N':
                System.out.println("N - Starting New Game\n");
                startNewGame();
                break;
            case 'R':
                System.out.println("R - Restarting the Game\n");
                restartGame();
                break;
            case 'H':
                System.out.println("H - Help is On the Way\n");
                getHelp();
                break;
            case 'P':
                System.out.println("P - Setting the Team Pace\n");
                setPace();
                break;
            case 'G':
                System.out.println("G - General Store Menu\n");
                generalStore();
                break;
            case 'S':
                System.out.println("S = Saving the Game\n");
                saveGame();
                return true;
            case 'E':
                System.out.println("E = Exiting the Game\n");
                return true;
            default:
                System.out.println("Only \"N, R, H, P, G, S, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail.getCurrentPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame() called ***");
    }

    private void setPace() {
        TeamPaceMenuView teamPaceMenuView = new TeamPaceMenuView();
        teamPaceMenuView.display();
    }

    private void generalStore() {
        GeneralStoreView generalStoreView = new GeneralStoreView();
        generalStoreView.display();
    }
}
