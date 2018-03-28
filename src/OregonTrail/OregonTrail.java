/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OregonTrail.model.AnimalsPlants;
import OregonTrail.model.CurrentDate;
import OregonTrail.model.EventGenerator;
import OregonTrail.model.Game;
import OregonTrail.model.InventoryItem;
import OregonTrail.model.Ox;
import OregonTrail.model.Wagon;

import OregonTrail.model.Player;
import OregonTrail.model.Map;
import OregonTrail.model.Money;
import OregonTrail.model.RandomEvents;
import OregonTrail.model.Team;
import OregonTrail.model.Weather;
import OregonTrail.model.Character;
import OregonTrail.model.Location;
import OregonTrail.model.Scene;
import OregonTrail.model.TownScene;
import OregonTrail.model.RegularScene;
import OregonTrail.model.FortScene;
import OregonTrail.model.GeneralStoreScene;
import OregonTrail.model.RiverScene;
import OregonTrail.model.HotelScene;
import OregonTrail.model.TrailStopScene;
import OregonTrail.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kim-jocelyn
 */
public class OregonTrail {

    private static Player currentPlayer = null;
    private static Game currentGame = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        OregonTrail.inFile = inFile;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        OregonTrail.currentPlayer = currentPlayer;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    /**
     * @param args the command line arguments
     */
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }

    public static void main(String[] args) {
        try {

            //open character stream filed for end ser input and output
            OregonTrail.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            OregonTrail.outFile
                    = new PrintWriter(System.out, true);
            OregonTrail.logFile = new PrintWriter("logFile.txt");

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (OregonTrail.inFile != null) {
                    OregonTrail.inFile.close();
                }

                if (OregonTrail.outFile != null) {
                    OregonTrail.outFile.close();
                }

                if (OregonTrail.logFile != null) {
                    OregonTrail.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("File did not close properly.");
            }
        }
    }
}
