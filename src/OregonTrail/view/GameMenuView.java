package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.MapControl;
import OregonTrail.model.Game;
import OregonTrail.model.Location;
import OregonTrail.model.Map;

/**
 *
 * @author kimta
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\nS - View Team Status\n"
                + "\nI - View Team Inventory and Supplies\n"
                + "\nP - Set the Team Pace\n"
                + "\nM - View Map\n"
                + "\nL - List Locations by Type\n"
                + "\nR - Print Report of Map Locations\n"
                + "\nH - View Help Menu\n"
                + "\nE - Exit Game Play Menu (Back to Main Menu)\n"
                + "\nPlease Choose an Option:");
    }

    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'S':
                this.console.println("S - Viewing Team Status\n");
                viewStatus();
                break;
            case 'I':
                this.console.println("I - Viewing Team Inventory\n");
                viewInventory();
                break;
            case 'P':
                this.console.println("P - Setting the Team Pace\n");
                setPace();
                break;
            case 'M':
                this.console.println("M - Viewing the Map\n");
                viewMap();
                break;
            case 'L':
                this.console.println("L - Listing Locations by Type\n");
                getLocations();
                break;
            case 'R':
                this.console.println("R - Printing Report of Map Location\n");
                runReport();
                break;
            case 'H':
                this.console.println("H - Help is On the Way\n");
                getHelp();
                break;
            case 'E':
                this.console.println("E - Exiting the Game Play Menu (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"S, I, P, M, H, and E\" are Valid Options\n");
                break;
        }

        return false;
    }

    private void viewMap() {
        this.console.println("Viewing the Map");
        Game game = OregonTrail.getCurrentGame();//get the currentGame from the main class
        Map map = game.getMap();//locations = get the 2-D locations array from the map
        Location[] locations = map.getLocations();
        for (int i = 0; i < locations.length; i++) {
            this.console.print(locations[i].getMapSymbol());
        }
        this.console.println("\n\nLegend"
                + "\nN = Nauvoo\nMR = Mississippi River\nCR = Chariton River\nGG = Garden Grove\nMP = Mount Pisgah"
                + "\nNR = Nishnabotna River\nK = Kanesville\nWQ = Winter Quarters\nPR = Platte River"
                + "\nFK = Fort Kearney\nCHR = Chimney Rock\nFL = Fort Laramie\nUPR = Upper Platte River"
                + "\nSR = Sweetwater River\nIR = Independence Rock\nMC = Martin's Cove\nGR = Green River"
                + "\nFB = Fort Bridger\nBR = Bear River\nSLV = Salt Lake Valley");

    }

    private void viewStatus() {
        this.console.println("*** viewStatus() called ***");
    }

    private void viewInventory() {
        this.console.println("*** viewInventory() called ***");
    }

    private void setPace() {
        TeamPaceMenuView teamPaceMenuView = new TeamPaceMenuView();
        teamPaceMenuView.display();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void getLocations() {
        MapControl.listLocations();
    }

    private void runReport() {
        MapReportView mapReportView = new MapReportView();
        mapReportView.display();
    }
}
