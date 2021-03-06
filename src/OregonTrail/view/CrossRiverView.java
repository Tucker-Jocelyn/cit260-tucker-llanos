package OregonTrail.view;

import OregonTrail.control.GameControl;
import OregonTrail.control.MapControl;
import OregonTrail.control.RiverCrossingControl;
import exceptions.RiverCrossingControlException;

/**
 *
 * @author Jocelyn Tucker
 */
public class CrossRiverView extends View {

    private int wagonWeight;

    public CrossRiverView(int wagonWeight) throws RiverCrossingControlException {
        super("Your chance of crossing the river successfully is: " + RiverCrossingControl.calcSuccessProbability(1500, wagonWeight, 3, 11, 80) + "%"
                + "\n\nDo You Want to Cross the River?\n"
                + "\nY - Cross the River"
                + "\nN - Go Back to the River Crossing Menu)\n"
                + "\nPlease Choose an Option:");
        this.wagonWeight = wagonWeight;
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));

        if (choice == 'Y') {
            try {
                this.console.println("Y - Crossing the River\n");
                double success = RiverCrossingControl.calcSuccessProbability(1500, wagonWeight, 3, 11, 80);
                if (success != 0) {
                    MapControl.moveTeam();
                    return true;
                } else {
                    GameControl.determineWin();
                }
            } catch (RiverCrossingControlException e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
            }
        } else if (choice == 'N') {
            this.console.println("N - Going Back to the River Crossing Menu)\n");
            return true;
        } else {
            this.console.println("Only \"Y and N\" are Valid Options\n");
            return false;
        }
        return false;

    }
}
