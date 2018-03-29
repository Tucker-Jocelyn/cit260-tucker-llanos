package OregonTrail.view;

import OregonTrail.control.RiverCrossingControl;
import exceptions.RiverCrossingControlException;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingView extends View {

    private int wagonWeight;

    public RiverCrossingView(int wagonWeight) throws RiverCrossingControlException {

        super("Your chance of crossing the river successfully is: " + RiverCrossingControl.calcSuccessProbability(1500, wagonWeight, 3, 11, 80) + "%"
                + "\n\nD - Drop Supplies"
                + "\nC - Cross the River"
                + "\nE - Go Back and Think About it (Back to Main Menu)\n");
        this.wagonWeight = wagonWeight;
    }

    @Override
    public String[] getInput() {

        boolean valid = false;
        String option = null;
        String[] inputs = new String[1];

        double waterDepth = 3;

        try {
            // while a valid input has not been retrieved
            while (valid == false) {
                this.console.println("\nThe river is " + waterDepth + "ft. deep."
                        + "\nPlease Choose an Option:");
                // get the value entered from the keyboard
                option = this.keyboard.readLine();
                option = option.trim();

                if (option.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "You must enter a value, blanks are not accepted here.");
                    continue;
                }

                inputs[0] = option;
                valid = true;
            }
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'D':
                this.console.println("D - Dropping Supplies\n");
                dropSupplies();
                break;
            case 'C':
                this.console.println("C - Crossing the River\n");
                crossRiver();
                break;
            case 'E':
                this.console.println("E - Going Back for More Thought (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"D, C, and E\" are Valid Options\n");
                break;
        }

        return false;
    }

    private void dropSupplies() {
        DropSuppliesView dropSuppliesView = new DropSuppliesView();
        dropSuppliesView.display();
    }

    private void crossRiver() {
        try {
            CrossRiverView crossRiverView = new CrossRiverView(wagonWeight);
            crossRiverView.display();
        } catch (RiverCrossingControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
}
