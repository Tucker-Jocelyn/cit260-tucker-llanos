package OregonTrail;

import OregonTrail.model.Game;

import OregonTrail.model.Player;
import OregonTrail.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
