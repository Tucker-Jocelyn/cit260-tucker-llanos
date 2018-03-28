package OregonTrail.view;

import OregonTrail.model.Team;

/**
 *
 * @author Kim Tanton
 */
public class TeamPaceMenuView extends View {

    public TeamPaceMenuView() {
        super("\nHere are Team Pace Menu Options:"
                + "\nS - Slow Pace\n"
                + "\nA - Average Pace\n"
                + "\nF - Fast Pace\n"
                + "\nE - Exit (Back to Main Menu)");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));

        Team trekkies = new Team();

        switch (choice) {
            case 'S':
                this.console.println("S - Setting Team Pace to Slow\n");

                trekkies.setPace("Slow");

                return true;
            case 'A':
                this.console.println("A - Setting Team Pace to Average\n");

                trekkies.setPace("Average");
                return true;
            case 'F':
                this.console.println("F - Setting Team Pace to Fast\n");

                trekkies.setPace("Fast");
                return true;
            case 'E':
                this.console.println("E - Exit (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"S, A, F, and E\" are Valid Options\n");
                break;
        }
        return false;

    }

}
