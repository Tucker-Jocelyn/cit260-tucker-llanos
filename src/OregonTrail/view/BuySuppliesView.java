package OregonTrail.view;

import OregonTrail.control.InventoryControl;
import OregonTrail.control.ResourceControl;
import OregonTrail.model.InventoryItem;

/**
 *
 * @author Jocelyn Tucker
 */
public class BuySuppliesView extends View {

    public BuySuppliesView() {
        super("\nF - Food: $0.20/lb"
                + "\n\tWe suggest you purchase 5 lbs of food per person per day\n"
                + "\nS - Spare Wagon Wheels: $10 each\n"
                + "\nA - Ammunition: $2/box"
                + "\n\tEach box contains 20 bullets\n"
                + "\nE - Exit (Back to General Store)");
    }

    @Override
    public String[] getInput() {

        boolean valid = false;
        String option = null;
        String[] inputs = new String[2];

        try {
            // while a valid input has not been retrieved   
            while (valid == false) {

                this.console.println("\nPlease Choose an Item to Buy:");
                // get the value entered from the keyboard
                option = this.keyboard.readLine();
                option = option.trim();

                if (option.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "You must enter a value, blanks are not accepted here.");
                    continue;
                }

                inputs[0] = option;
                option = option.toUpperCase();

                if (option.equals("E")) {
                    valid = true;

                } else if (!option.equals("F") && !option.equals("S") && !option.equals("A")) {
                    this.console.println("Only \"F, S, A, and E\" are Valid Options\n");
                    continue;

                } else {
                    this.console.println("\nPlease Enter the Amount You Would Like to Buy:");
                    String itemAmount = null;
                    // get the value entered from the keyboard
                    itemAmount = this.keyboard.readLine();
                    itemAmount = itemAmount.trim();

                    if (itemAmount.length() < 1) {
                        ErrorView.display(this.getClass().getName(), "You must enter a value, blanks are not accepted here.");
                        continue;
                    }

                    inputs[1] = itemAmount;
                }
                valid = true;
            }

        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs
    ) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        InventoryItem inventoryType;

        if (choice == 'F') {
            inventoryType = InventoryItem.FOOD;
        } else if (choice == 'S') {
            inventoryType = InventoryItem.WHEEL;
        } else if (choice == 'A') {
            inventoryType = InventoryItem.AMMO;
        } else if (choice == 'E') {
            return true;
        } else {
            this.console.println("Only \"F, S, A, and E\" are Valid Options\n");
            return false;
        }

        int inventoryAmount;

        try {
            inventoryAmount = Integer.parseInt(inputs[1]);
        } catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(), "\nOnly Numbers are Valid Options\n");
            return false;
        }

        if (choice == 'A') {
            inventoryAmount *= 20;
        }

        double moneyAvailable = ResourceControl.calcMoneyResource(inventoryType.index, inventoryAmount);

        if (moneyAvailable == -999) {
            ErrorView.display(this.getClass().getName(), "\nYou do not have enough funds to complete this purchase. Please try again.\n");
            return false;
        }

        double inventoryWeight = InventoryControl.calcTotalInventoryWeight();

        if (inventoryWeight == -999) {
            ErrorView.display(this.getClass().getName(), "\nYour wagon can't carry this much weight. Please try again.\n");
            return false;
        }

        InventoryControl.calcAddStoreItem(inventoryType.index, inventoryAmount);

        this.console.println(inventoryAmount + " " + inventoryType.inventoryName + " added to your inventory.\n"
                + "$" + moneyAvailable + " is how much you have available to spend."
                + "\nYour total inventory weight is " + inventoryWeight);

        return false;
    }
}
