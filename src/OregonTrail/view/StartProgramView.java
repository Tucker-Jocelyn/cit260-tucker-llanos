/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*2-21-18 12:02 am
To DO:
1) resilve error [(endOfView = doAction(inputs);]
2) call new instance of StartProgramView in the main OregonTrail.java file (imports??)
3) continue on with the instructions - left off on Pg. 9 item #6

****so far we are still working on "Q" (quit and exit game play) of the Start Menu
Help Menu
    Game Objective
    How to Move
    Tips
    Return to Previous Menu (which is the Main Menu)
Main Menu
    Start (or return to) Game
    Help Menu
    Save Game
    Exit Main Menu (return to Start Menu)
Start Menu
    Start a New Game
    Reload a Saved Game
    Quit Program (exit game play)
 */
package OregonTrail.view;

import OregonTrail.control.GameControl;
import OregonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jocelyn & Kim
 */
public class StartProgramView {

    public StartProgramView() {
    }

    public void displayStartProgramView() {

        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();

            //check input length
            if (inputs.length < 1) {
                return;
            }

            //retrieve 1st value in array and convert input to uppercase
            String value = inputs[0];
            value = value.toUpperCase();

            // check to see if the value = "Q" if true, then return
            if (value.equals("Q")) {
                return;
            }


            /*need logic & syntax for "next step", which is:  the do action function we are tyring
                to call (endofView = doAction(inputs); */
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    private String[] getInputs() {
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];
        System.out.println("Welcome to the Oregon Trail. The objective of this game is travel from Nauvoo to the Salt Lake Valley."
                + "\nYou will outfit your team with supplies at the beginning of the trek."
                + "\nYou will have opportunities to shop for additional supplies at towns and forts along the way - provided you have the funds to do so."
                + "\nAlong the way you will make decisions affecting your team's health including pace of travel, and whether or not to rest."
                + "\nYou will also choose which locations to visit, and whether or not you wish to hunt and gather."
                + "\nYou may add a team member only when there is a vacancy on the team."
                + "\nEvents may happen along the way to either help or hinder your progress. "
                + "\nGood Luck!!");

        boolean valid = false;

        while (valid == false) {

            System.out.println("\nPlease enter your name: ");
            String name = in.nextLine();

            name = name.trim();

            if (name.length() < 1) {
                System.out.println("You must enter a value, blanks are not accepted here. ");

                continue;
            }

            inputs[0] = name;
            valid = true;

        }
        return inputs;

    }

    private boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);

        if (player == null) {
            System.out.println("Could not create the player. Enter a different name.");
            return false;
        }

        System.out.println(("\nWelcome to the Oregon Trail" + playersName)
                + ("\nGood luck on your journey to the Salt Lake Valley!"));

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();

        return true;
    }

}
