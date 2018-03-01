package OregonTrail.view;

import OregonTrail.control.InventoryControl;
import OregonTrail.control.ResourceControl;
import java.util.Scanner;

/**
 *
 * @author Jocelyn Tucker
 */
class BuySuppliesView {

    void displayBuySuppliesView() {
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

        String[] inputs = new String[2];

        System.out.println("\nO - Oxen: $20 each"
                + "\n\tEach ox can pull 550 lbs. We suggest you purchase 6\n"
                + "\nS - Small Wagon: $60"
                + "\n\tA small wagon weighs 1250 lbs and can carry 1800 lbs of supplies\n"
                + "\nM - Medium Wagon: $70"
                + "\n\tA medium wagon weighs 1300 lbs and can carry 2000 lbs of supplies\n"
                + "\nL - Large Wagon: $80"
                + "\n\tA large wagon weighs 1350 lbs and can carry 2200 lbs of supplies\n"
                + "\nF - Food: $0.20/lb"
                + "\n\tWe suggest you purchase 5 lbs of food per person per day\n"
                + "\nW - Spare Wagon Wheels: $10 each\n"
                + "\nA - Ammunition: $2/box"
                + "\n\tEach box contains 20 bullets\n"
                + "\nE - Exit to General Store Menu");

        boolean valid = false;

        while (valid == false) {

            System.out.println("\nPlease Choose an Item to Buy:");
            String option = in.nextLine();
            option = option.trim();

            if (option.length() < 1) {
                System.out.println("You must enter a value, blanks are not accepted here.");
                continue;
            }

            inputs[0] = option;

            if (option.equals("E") || option.equals("e")) {
                valid = true;
            } else {
                System.out.println("\nPlease Enter the Amount You Would Like to Buy:");
                String itemAmount = in.nextLine();
                itemAmount = itemAmount.trim();

                if (itemAmount.length() < 1) {
                    System.out.println("You must enter a value, blanks are not accepted here.");
                    continue;
                }

                inputs[1] = itemAmount;
            }
            valid = true;
        }

        return inputs;

    }

    private boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        int inventoryType;
        String inventoryName = null;

        if (choice == 'O') {
            inventoryType = 0;
            inventoryName = "oxen";
        } else if (choice == 'S') {
            inventoryType = 1;
            inventoryName = "small wagon";
        } else if (choice == 'M') {
            inventoryType = 2;
            inventoryName = "medium wagon";
        } else if (choice == 'L') {
            inventoryType = 3;
            inventoryName = "large wagon";
        } else if (choice == 'F') {
            inventoryType = 4;
            inventoryName = "lbs of food";
        } else if (choice == 'W') {
            inventoryType = 5;
            inventoryName = "spare wagon wheel";
        } else if (choice == 'A') {
            inventoryType = 6;
            inventoryName = "bullets";
        } else if (choice == 'E') {
            return true;
        } else {
            System.out.println("Only \"O, S, M, L, F, W, A, and E\" are Valid Options\n");
            return false;
        }

        int inventoryAmount = Integer.parseInt(inputs[1]);

        if (choice == 'A') {
            inventoryAmount *= 20;
        }

        double moneyAvailable = ResourceControl.calcMoneyResource(inventoryType, inventoryAmount);
        
        if (moneyAvailable == -999){
            System.out.println("\nYou do not have enough funds to complete this purchase. Please try again.\n");
            return false;
        }

        double inventoryWeight = InventoryControl.calcTotalInventoryWeight();
        
        if (inventoryWeight == -999){
            System.out.println("\nYour wagon can't carry this much weight. Please try again.\n");
            return false;
        }
                
        InventoryControl.calcAddStoreItem(inventoryType, inventoryAmount);

        System.out.println(inventoryAmount + " " + inventoryName + " added to your inventory.\n"
                + "$" + moneyAvailable + " is how much you have available to spend."
                + "\nYour total inventory weight is " + inventoryWeight);

        return false;
    }
}
