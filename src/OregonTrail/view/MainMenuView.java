/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import exceptions.GameControlException;
import exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                System.out.println("N - Starting New Game\n");
                startNewGame();
                break;
            case 'R':
                System.out.println("R - Restarting the Game\n");
                restartGame();
                break;
            case 'H':
                System.out.println("H - Help is On the Way\n");
                getHelp();
                break;
            case 'G':
                System.out.println("G - General Store Menu\n");
                generalStore();
                break;
            case 'T':
                System.out.println("T - Daily Trail Menu\n");
                dailyTrailStop();
                break;
            case 'C':
                System.out.println("C - River Crossing Menu\n");
                riverCrossing();
                break;
            case 'L':
                System.out.println("L - Hotel Scene Menu\n");
                hotel();
                break;
            case 'S':
                System.out.println("S - Saving the Game\n");
                saveGame();
                return true;
            case 'E':
                System.out.println("E - Exiting the Game\n");
                return true;
            default:
                System.out.println("Only \"N, R, H, P, G, T, C, L, S, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(OregonTrail.getCurrentPlayer());
            System.out.println(OregonTrail.getCurrentGame().getTeam().getWagon());
            BuyWagonView buyWagonView = new BuyWagonView();
            buyWagonView.display();
            System.out.println(OregonTrail.getCurrentGame().getTeam().getWagon());
            System.out.println(OregonTrail.getCurrentGame().getTeam().getOx());
            BuyOxenView buyOxenView = new BuyOxenView();
            buyOxenView.display();
            System.out.println(OregonTrail.getCurrentGame().getTeam().getOx());
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
        } catch (MapControlException ex) {
            //Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (GameControlException ex) {
            //Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
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
        System.out.println("*** saveGame() called ***");
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
        RiverCrossingView riverCrossingView = new RiverCrossingView();
        riverCrossingView.display();
    }

    private void hotel() {
        HotelSceneView hotelSceneView = new HotelSceneView();
        hotelSceneView.display();
    }
}
