package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import exceptions.GameControlException;
import exceptions.MapControlException;
import exceptions.RiverCrossingControlException;

/**
 *
 * @author Jocelyn and Kim
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\nHere are your Main Menu Options:"
                + "\nN - Start new game\n"
                + "\nR - Restart existing game\n"
                + "\nH - Get help on how to play the game\n"
                + "\nG - General Store Menu\n"
                + "\nT - Daily Trail Stop Menu\n"
                + "\nC - River Crossing Menu\n"
                + "\nX - River Crossing Menu with Exception\n"
                + "\nL - Hotel Scene Menu\n"
                + "\nS - Save game\n"
                + "\nE - Exit the Game\n"
                + "\nPlease Choose an Option:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'N':
                this.console.println("N - Starting New Game\n");
                startNewGame();
                break;
            case 'R':
                this.console.println("R - Restarting the Game\n");
                restartGame();
                break;
            case 'H':
                this.console.println("H - Help is On the Way\n");
                getHelp();
                break;
            case 'G':
                this.console.println("G - General Store Menu\n");
                generalStore();
                break;
            case 'T':
                this.console.println("T - Daily Trail Menu\n");
                dailyTrailStop();
                break;
            case 'C':
                this.console.println("C - River Crossing Menu\n");
                riverCrossing();
                break;
            case 'X':
                this.console.println("X - River Crossing Menu that Throws Exception\n");
                riverCrossingEx();
                break;
            case 'L':
                this.console.println("L - Hotel Scene Menu\n");
                hotel();
                break;
            case 'S':
                this.console.println("S - Saving the Game\n");
                saveGame();
                return true;
            case 'E':
                this.console.println("E - Exiting the Game\n");
                return true;
            default:
                this.console.println("Only \"N, R, H, P, G, T, C, L, S, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(OregonTrail.getCurrentPlayer());
            this.console.println(OregonTrail.getCurrentGame().getTeam().getWagon());

            BuyWagonView buyWagonView = new BuyWagonView();
            buyWagonView.display();
            this.console.println(OregonTrail.getCurrentGame().getTeam().getWagon());
            this.console.println(OregonTrail.getCurrentGame().getTeam().getOx());

            BuyOxenView buyOxenView = new BuyOxenView();
            buyOxenView.display();
            this.console.println(OregonTrail.getCurrentGame().getTeam().getOx());

            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        this.console.println("*** saveGame() called ***");
    }

    private void generalStore() {
        GeneralStoreView generalStoreView = new GeneralStoreView();
        generalStoreView.display();
    }

    private void dailyTrailStop() {
        DailyTrailStopSceneMenuView view = new DailyTrailStopSceneMenuView();
        view.display();
    }

    private void riverCrossing() {
        try {
            RiverCrossingView riverCrossingView = new RiverCrossingView(1300);
            riverCrossingView.display();
        } catch (RiverCrossingControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

    private void hotel() {
        HotelSceneView hotelSceneView = new HotelSceneView();
        hotelSceneView.display();
    }

    private void riverCrossingEx() {
        try {
            RiverCrossingView riverCrossingView = new RiverCrossingView(1200);
            riverCrossingView.display();
        } catch (RiverCrossingControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
}
