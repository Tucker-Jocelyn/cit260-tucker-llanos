/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.model.Team;
import java.util.Scanner;

/**
 *
 * @author Kim Tanton
 */
public class TeamPaceMenuView {
    void displayTeamPaceMenuView() {
        System.out.println("*** displayTeamPaceMenuView() called ***");
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

    private String[] getInputs() {
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];

        System.out.println("\nHere are Team Pace Menu Options:"
                + "\nS - Slow Pace\n"
                + "\nA - Average Pace\n"
                + "\nF - Fast Pace\n"
                + "\nE - Exit Team Pace Menu (Back to Game Play Menu)");

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

    private boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        
        //temporary setting of a Team within this View Menu - not for end-functionality
        Team trekkies = new Team();
        
        switch (choice) {
            case 'S':
                System.out.println("S - Setting Team Pace to Slow\n");
                
                //need help with connecting the setPace function to the Team Pace Menu View
               trekkies.setPace("Slow");
               
                return true;
            case 'A':
                System.out.println("A - Setting Team Pace to Average\n");
                
                //need help with connecting the setPace function to the Team Pace Menu View
                trekkies.setPace("Average");
                return true;
            case 'F':
                System.out.println("F - Setting Team Pace to Fast\n");
                
                //need help with connecting the setPace function to the Team Pace Menu View
                trekkies.setPace("Fast");
                return true;
            case 'E':
                System.out.println("E = Returning to the previous menu(Game Play)\n");
                return true;
            default:
                System.out.println("Only \"S, A, F, and E\" are Valid Options\n");
                break;
        }
        return false;
        
        
    }

    /*private void setSlowPace() {

    }

    private void setAveragePace() {
    
    }

    private void setFastPace() {
       
    }


*/
}

