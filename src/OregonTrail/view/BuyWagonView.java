/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.model.Wagon;

/**
 *
 * @author Jocelyn
 */
public class BuyWagonView extends View {

    BuyWagonView() {
        super("buy a wagon");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'B':
                buyWagon();
                return true;
            case 'E':
                return true;
            default:
                System.out.println("Only \"B and E\" are Valid Options\n");
        }
        return false;
    }

    private void buyWagon() {
        Wagon wagon = new Wagon();
        OregonTrail.getCurrentGame().getTeam().setWagon(wagon);

    }

}
