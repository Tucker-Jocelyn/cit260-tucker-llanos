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
public class TeamPaceMenuView extends View {

    public TeamPaceMenuView() {
        super("\nHere are Team Pace Menu Options:"
                + "\nS - Slow Pace\n"
                + "\nA - Average Pace\n"
                + "\nF - Fast Pace\n"
                + "\nE - Exit (Back to Main Menu)");
    }

 
    @Override
    public boolean doAction(String[] inputs) {
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
                System.out.println("E = Exit (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"S, A, F, and E\" are Valid Options\n");
                break;
        }
        return false;

    }

}
