/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.model.Wagon;
import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class BuyWagonView extends View {

    public BuyWagonView() {
        super("\nYou need to purchase a wagon. These are the wagons we have available:\n"
                + "\nS - Small Wagon: $60"
                + "\n\tA small wagon weighs 1250 lbs and can carry 1800 lbs of supplies\n"
                + "\nM - Medium Wagon: $70"
                + "\n\tA medium wagon weighs 1300 lbs and can carry 2000 lbs of supplies\n"
                + "\nL - Large Wagon: $80"
                + "\n\tA large wagon weighs 1350 lbs and can carry 2200 lbs of supplies\n"
                + "\nPlease Choose an Option:");
    }

    //**************update later to remove exit option
    
    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'S':
                buyWagon();
                return true;
            case 'M':
                buyWagon();
                return true;
            case 'L':
                buyWagon();
                return true;
            case 'E':
                return true;
            default:
                System.out.println("Only \"S, M, L, and E\" are Valid Options\n");
        }
        return false;
    }

    private void buyWagon() {
        Wagon wagon = new Wagon();
        OregonTrail.getCurrentGame().getTeam().setWagon(wagon);

    }

}
