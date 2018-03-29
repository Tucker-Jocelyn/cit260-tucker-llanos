package OregonTrail.view;

/**
 *
 * @author Jocelyn
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\nHere are your Help Menu Options:"
                + "\nG - Game Objective\n"
                + "\nM - How to Move\n"
                + "\nT - Tips\n"
                + "\nE - Exit Help Menu (Back to Main Menu)\n"
                + "\nPlease Choose an Option:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'G':
                this.console.println("G - Displaying game objective\n");
                gameObjective();
                break;
            case 'M':
                this.console.println("M - Displaying how to move\n");
                howToMove();
                break;
            case 'T':
                this.console.println("T - Displaying tips for the game\n");
                getTips();
                break;
            case 'E':
                this.console.println("E - Exit (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"G, M, T, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void gameObjective() {
        ViewGameObjective viewGameObjective = new ViewGameObjective();
        viewGameObjective.display();
    }

    private void howToMove() {
        ViewMoveOptions viewMoveOptions = new ViewMoveOptions();
        viewMoveOptions.display();
    }

    private void getTips() {
        ViewGameTips viewGameTips = new ViewGameTips();
        viewGameTips.display();
    }

}
