/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.model.Ox;
import OregonTrail.model.Wagon;

/**
 *
 * @author Jocelyn and Kim
 */
public class BuyOxenView extends View {

    public BuyOxenView() {
        super("\nYou need to purchase oxen. Each ox can pull 550 lbs. We suggest you purchase 6. They cost $20 each and come in sets of two.\n"
                + "\nWhich set would you like to purchase?\n"
                + "\nS - Set of 2 oxen - total pull weight 1100 lbs: $40\n"
                + "\nM - Set of 4 oxen - total pull weight 2200 lbs: $80\n"
                + "\nL - Set of 6 oxen - total pull weight 3300 lbs: $120\n"
                + "\nPlease Choose an Option:");
    }

    //**************update later to remove exit option
    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'S':
                buyOxen();
                return true;
            case 'M':
                buyOxen();
                return true;
            case 'L':
                buyOxen();
                return true;
            case 'E':
                return true;
            default:
                System.out.println("Only \"S, M, L, and E\" are Valid Options\n");
        }
        return false;
    }

    private void buyOxen() {
        Ox ox = new Ox();
        OregonTrail.getCurrentGame().getTeam().setOx(ox);

    }

}
