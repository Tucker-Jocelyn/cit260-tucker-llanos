/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Jocelyn and Kim
 */
class MainMenuView {

    void displayMainMenuView() {
        System.out.println("Here are your Game Play Options:"
                + "\nN - Start new game\n"
                + "\nR - Restart existing game\n"
                + "\nH - Get help on how to play the game\n"
                + "\nE - Exit");
        
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();

            //check input length
            if (inputs.length < 1) {
                return;
            }

            //retrieve 1st value in array and convert input to uppercase
            String value = inputs[0];
            
            //commenting  this out becasue it does not apper to be working (entered name = "Kim" and displayed same)
            //value = value.toUpperCase();

            
            //commenting these lines out becasue we wil be adding this logic in the do function
            // check to see if the value = "N" if true, then return
            //if (value.equals("N")) {
                //return;
            //}


            /*need logic & syntax for "next step", which is:  the do action function we are tyring
                to call (endofView = doAction(inputs); */
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    private String[] getInputs() {
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];

        boolean valid = false;

        while (valid == false) {

            System.out.println("\nPlease Choose and Option ");
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
    char choice = Character.toUpperCase(inputs[0].charAt(0));
            switch (choice) {
            case 'N':
                System.out.println("N - Starting New Game");
                break;
            case 'R':
                System.out.println("R - Restarting the Game");
                break;
            case 'H':
                System.out.println("H - Help is On the Way");
                break;
            case 'E':
                System.out.println("E = Exiting the Game");
                return true;
            default: 
                System.out.println("Only \"N, R, H, and E\"  are Valid Options");
                break;
    }
            return false;
    }
    
    
    private void startNewGame() {
        
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
}
