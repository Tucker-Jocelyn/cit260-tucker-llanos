package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
class HelpMenuView {

    void displayHelpMenuView() {
        //System.out.println("*** displayHelpMenuView() called ***");
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

        System.out.println("\nHere are your Help Menu Options:"
                + "\nG - Game objective\n"
                + "\nM - How to move\n"
                + "\nT - Tips\n"
                + "\nR - Return to previous menu");

        boolean valid = false;

        while (valid == false) {

            System.out.println("\nPlease Choose an Option");
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
            case 'G':
                System.out.println("G - Displaying game objective\n");
                gameObjective();
                break;
            case 'M':
                System.out.println("M - Displaying how to move\n");
                howToMove();
                break;
            case 'T':
                System.out.println("T - Displaying tips for the game\n");
                getTips();
                break;
            case 'R':
                System.out.println("R = Returning to the previous menu\n");
                return true;
            default:
                System.out.println("Only \"G, M, T, and R\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void gameObjective() {
        System.out.println("*** gameObjective() called ***");
    }

    private void howToMove() {
        System.out.println("*** howToMove() called ***");
    }

    private void getTips() {
        System.out.println("*** getTips() called ***");
    }

}
