package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.MapControl;
import OregonTrail.model.Location;
import exceptions.MapControlException;
import java.io.IOException;

/**
 *
 * @author Jocelyn Tucker
 */
public class MapReportView extends View {

    public MapReportView() {
        super("To save a report of all map locations, please enter a file path:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Location[] locations = OregonTrail.getCurrentGame().getMap().getLocations();
        try {
            MapControl mapControl = new MapControl();
            mapControl.printMapReport(filePath, locations);
        } catch (MapControlException | IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        this.console.println("\nYour report has been saved as " + filePath);
        return true;
    }

}
