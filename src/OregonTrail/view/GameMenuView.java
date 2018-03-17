/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
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
                + "\nV - View Map\n"
                + "\nH - View Help Menu\n"
                + "\nE - Exit Game Play Menu (Back to Main Menu)\n"
                + "\nPlease Choose an Option:");
    }

    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'S':
                System.out.println("S - Viewing Team Status\n");
                viewStatus();
                break;
            case 'I':
                System.out.println("I - Viewing Team Inventory\n");
                viewInventory();
                break;
            case 'P':
                System.out.println("P - Setting the Team Pace\n");
                setPace();
                break;
            case 'V':
                System.out.println("V - Viewing the Map\n");
                viewMap();
                break;
            case 'H':
                System.out.println("H - Help is On the Way\n");
                getHelp();
                break;
            case 'E':
                System.out.println("E - Exiting the Game Play Menu (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"S, I, P, V, H, and E\" are Valid Options\n");
                break;
        }

        return false;
    }

    private void viewMap() {
        System.out.println("Viewing the Map");
Game game = OregonTrail.getCurrentGame();//get the currentGame from the main class 
Map map = game.getMap();//locations = get the 2-D locations array from the map
Location[] locations = map.getLocations();
for (int i = 0; i < locations.length; i++){
  System.out.print(locations[i].getMapSymbol());
}
System.out.println("\n\nLegend"
    + "\nN = Nauvoo\nMR = Mississippi River\nCR = Chariton River\nGG = Garden Grove\nMP = Mount Pisgah"
    +   "\nNR = Nishnabotna River\nK = Kanesville\nWQ = Winter Quarters\nPR = Platte River"
    + "\nFK = Fort Kearney\nCHR = Chimney Rock\nFL = Fort Laramie\nUPR = Upper Platte River"
    + "\nSR = Sweetwater River\nIR = Independence Rock\nMC = Martin's Cove\nGR = Green River"
    + "\nFB = Fort Bridger\nBR = Bear River\nSLV = Salt Lake Valley");

//if location has been visited
//Get the mapSymbol for the scene in this location
//Print the mapSymbol 
//else
//Print 
//"
 //?? 
//"
//endif//
//endFor 
//Print the ending column divider
//endFor
//Print the ending row divider
    }

    private void viewStatus() {
        System.out.println("*** viewStatus() called ***");
    }

    private void viewInventory() {
        System.out.println("*** viewInventory() called ***");
    }

    private void setPace() {
        TeamPaceMenuView teamPaceMenuView = new TeamPaceMenuView();
        teamPaceMenuView.display();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
