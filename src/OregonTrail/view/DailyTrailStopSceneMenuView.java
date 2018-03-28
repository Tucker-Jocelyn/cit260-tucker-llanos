package OregonTrail.view;

/**
 *
 * @author Kim Llanos
 */
public class DailyTrailStopSceneMenuView extends View {

    public DailyTrailStopSceneMenuView() {
        super("\nHere are your Daily Trail Stop Options:"
                + "\nT - Visit Town\n"
                + "\nF - Visit Fort\n"
                + "\nC - Cross River\n"
                + "\nR - Rest for the Day\n"
                + "\nH - Go Hunting\n"
                + "\nP - Gather Plants\n"
                + "\nE - Exit (Back to Main Menu)");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'T':
                this.console.println("T - Visit the Nearby Town\n");
                visitTown();
                break;
            case 'F':
                this.console.println("F - Visit the Nearby Fort\n");
                visitFort();
                break;
            case 'C':
                this.console.println("C - Cross the River\n");
                crossRiver();
                break;
            case 'R':
                this.console.println("R - Rest for the Day\n");
                dailyRest();
                break;
            case 'H':
                this.console.println("H - Hunt for Animals\n");
                goHunting();
                break;
            case 'P':
                this.console.println("G - Gather Edible Plants\n");
                gatherPlants();
                return true;
            case 'E':
                this.console.println("E - Exit (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"T, F, C, R, H, P, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void visitTown() {
        this.console.println("Go to the Visit Town Scene ");
    }

    private void visitFort() {
        this.console.println("Go to the Visit Fort Scene ");
    }

    private void crossRiver() {
        this.console.println("Go to the Crossing River Scene ");
    }

    private void dailyRest() {
        this.console.println("You Will Now Rest for the Day ");
    }

    private void goHunting() {
        this.console.println("Go to the Hunt for Animals Scene ");
    }

    private void gatherPlants() {
        this.console.println("Go to the Gather Edible Plants Scene ");
    }

}
