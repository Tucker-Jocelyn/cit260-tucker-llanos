/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.control.GameControl;
import OregonTrail.control.MapControl;
import OregonTrail.control.RiverCrossingControl;

/**
 *
 * @author Jocelyn Tucker
 */
public class CrossRiverView extends View {

    public CrossRiverView() {
        super("Your chance of crossing the river successfully is: " + RiverCrossingControl.calcSuccessProbability(1500, 1300, 3, 11, 80) + "%"
                + "\n\nDo You Want to Cross the River?\n"
                + "\nY - Cross the River"
                + "\nN - Go Back to the River Crossing Menu)\n"
                + "\nPlease Choose an Option:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));

        if (choice == 'Y') {
            System.out.println("Y - Crossing the River\n");
            double success = RiverCrossingControl.calcSuccessProbability(1500, 1300, 3, 11, 80);
            if (success != 0) {
                MapControl.moveTeam();
                return true;
            } else {
                GameControl.determineWin();
            }
        } else if (choice == 'N') {
            System.out.println("N - Going Back to the River Crossing Menu)\n");
            return true;
        } else {
            System.out.println("Only \"Y and N\" are Valid Options\n");
            return false;
        }
        return false;

    }
}
