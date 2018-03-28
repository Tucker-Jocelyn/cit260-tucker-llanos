package OregonTrail.view;

import OregonTrail.OregonTrail;
import java.io.PrintWriter;

/**
 *
 * @author Kim and Jocelyn
 */
public class ErrorView {

    private static PrintWriter errorFile = OregonTrail.getOutFile();
    private static PrintWriter logFile = OregonTrail.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "\n--ERROR--------------------------------------------------"
                + "\n" + errorMessage
                + "\n-------------------------------------------------------");

        logFile.printf("%n%n%s", className + " - " + errorMessage);
    }

}
