package OregonTrail.view;

import OregonTrail.control.InventoryControl;
import OregonTrail.control.ResourceControl;
import OregonTrail.model.InventoryItem;
import java.util.Scanner;

/**
 *
 * @author Jocelyn Tucker
 */
public class BuySuppliesView extends View {

    public BuySuppliesView() {
        super("\nO - Oxen: $20 each"
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
                + "\nE - Exit (Back to General Store)");
    }

    /*
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
     */
    @Override
    public String[] getInput() {
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[2];

        /*
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
                + "\nE - Exit (Back to General Store)");
         */
        boolean valid = false;

        while (valid == false) {
            System.out.println("\n" + this.displayMessage);
            System.out.println("\nPlease Choose an Item to Buy:");
            String option = in.nextLine();
            option = option.trim();

            if (option.length() < 1) {
                System.out.println("You must enter a value, blanks are not accepted here.");
                continue;
            }

            inputs[0] = option;
            option = option.toUpperCase();

            if (option.equals("E")) {
                valid = true;
            } else if (!option.equals("O") && !option.equals("S") && !option.equals("M") && !option.equals("L") && !option.equals("F") && !option.equals("W") && !option.equals("A")) {
                System.out.println("Only \"O, S, M, L, F, W, A, and E\" are Valid Options\n");
                continue;
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

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        InventoryItem inventoryType;

        if (choice == 'O') {
            inventoryType = InventoryItem.OX;
        } else if (choice == 'S') {
            inventoryType = InventoryItem.SMALL_WAGON;
        } else if (choice == 'M') {
            inventoryType = InventoryItem.MEDIUM_WAGON;
        } else if (choice == 'L') {
            inventoryType = InventoryItem.LARGE_WAGON;
        } else if (choice == 'F') {
            inventoryType = InventoryItem.FOOD;
        } else if (choice == 'W') {
            inventoryType = InventoryItem.WHEEL;
        } else if (choice == 'A') {
            inventoryType = InventoryItem.AMMO;
        } else if (choice == 'E') {
            return true;
        } else {
            System.out.println("Only \"O, S, M, L, F, W, A, and E\" are Valid Options\n");
            return false;
        }

        int inventoryAmount;

        try {
            inventoryAmount = Integer.parseInt(inputs[1]);
        } catch (NumberFormatException e) {
            System.out.println("\nOnly Numbers are Valid Options\n");
            return false;
        }

        if (choice == 'A') {
            inventoryAmount *= 20;
        }

        double moneyAvailable = ResourceControl.calcMoneyResource(inventoryType.index, inventoryAmount);

        if (moneyAvailable == -999) {
            System.out.println("\nYou do not have enough funds to complete this purchase. Please try again.\n");
            return false;
        }

        double inventoryWeight = InventoryControl.calcTotalInventoryWeight();

        if (inventoryWeight == -999) {
            System.out.println("\nYour wagon can't carry this much weight. Please try again.\n");
            return false;
        }

        InventoryControl.calcAddStoreItem(inventoryType.index, inventoryAmount);

        System.out.println(inventoryAmount + " " + inventoryType.inventoryName + " added to your inventory.\n"
                + "$" + moneyAvailable + " is how much you have available to spend."
                + "\nYour total inventory weight is " + inventoryWeight);

        return false;
    }
}
