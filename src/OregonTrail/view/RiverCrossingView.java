package OregonTrail.view;

import OregonTrail.control.RiverCrossingControl;
import java.util.Scanner;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingView extends View {

    public RiverCrossingView() {

        super("Your chance of crossing the river successfully is: " + RiverCrossingControl.calcSuccessProbability(1500, 1300, 3, 11, 80) + "%"
                + "\n\nD - Drop Supplies"
                + "\nC - Cross the River"
                + "\nG - Go Back and Think About it (Back to Main Menu)\n"
                + "\nPlease Choose an Option:");
    }

    @Override
    public String[] getInput() {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        String[] inputs = new String[1];

        double waterDepth = 3;

        while (valid == false) {
            System.out.println("\nThe river is " + waterDepth + "ft. deep."
                    + "\n" + this.displayMessage);
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

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'D':
                System.out.println("D - Dropping Supplies\n");
                dropSupplies();
                break;
            case 'C':
                System.out.println("C - Crossing the River\n");
                crossRiver();
                break;
            case 'G':
                System.out.println("G - Going Back for More Thought (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"D, C, and G\" are Valid Options\n");
                break;
        }

        return false;
    }

    private void dropSupplies() {
        DropSuppliesView dropSuppliesView = new DropSuppliesView();
        dropSuppliesView.displayDropSuppliesView();
    }

    private void crossRiver() {
        CrossRiverView crossRiverView = new CrossRiverView();
        crossRiverView.display();
    }
}
