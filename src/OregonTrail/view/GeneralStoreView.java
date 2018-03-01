package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Jocelyn Tucker
 */
public class GeneralStoreView {

    void displayGeneralStoreView() {
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

        System.out.println("\nWelcome to the General Store. These are the items we carry and their prices:"
                + "\nOxen: $20 each"
                + "\nWagons: Small $60, Medium $70, Large $80"
                + "\nFood: $0.20/lb"
                + "\nSpare Wagon Wheels: $10 each"
                + "\nAmmunition: $2/box\n");

        System.out.println("\nV - View Current Supplies"
                + "\nB - Buy"
                + "\nS - Sell"
                + "\nE - Exit the General Store");

        boolean valid = false;

        while (valid == false) {

            System.out.println("\nPlease Choose an Option:");
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
        switch (choice) {
            case 'V':
                System.out.println("V - View Your Current Supplies\n");
                viewSupplies();
                break;
            case 'B':
                System.out.println("B - Buy Supplies\n");
                buySupplies();
                break;
            case 'S':
                System.out.println("S - Sell Your Extra Supplies\n");
                sellSupplies();
                break;
            case 'E':
                System.out.println("E - Exiting the General Store\n");
                return true;
            default:
                System.out.println("Only \"V, B, S, and E\" are Valid Options\n");
                break;
        }

        return false;
    }

    private void viewSupplies() {
        SuppliesView suppliesView = new SuppliesView();
        suppliesView.displaySuppliesView();
    }

    private void buySupplies() {
        BuySuppliesView buySuppliesView = new BuySuppliesView();
        buySuppliesView.displayBuySuppliesView();
    }

    private void sellSupplies() {
        SellSuppliesView sellSuppliesView = new SellSuppliesView();
        sellSuppliesView.displaySellSuppliesView();
    }
}
