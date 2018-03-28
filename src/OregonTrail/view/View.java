package OregonTrail.view;

import OregonTrail.OregonTrail;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Kim & Jocelyn
 */
public abstract class View implements ViewInterface {

    private String displayMessage;

    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean endOfView = false;
        do {
            this.console.println("\n" + this.displayMessage);
            String[] inputs = this.getInput();
            String value = inputs[0];
            if (value.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the view
            }
            //do the requestee action and display the next view
            endOfView = this.doAction(inputs);

        } while (endOfView != true); // exit the view when endOFView == true

    }

    @Override
    public String[] getInput() {

        boolean valid = false;
        String option = null;
        String[] inputs = new String[1];

        try {
            // while a valid input has not been retrieved
            while (valid == false) {

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
}
