/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.TeamControl;
import OregonTrail.model.Team;
import exceptions.TeamControlException;
import java.io.IOException;

/**
 *
 * @author Kim Llanos
 */
public class TeamAnimalPlantView extends View {

    public TeamAnimalPlantView() {
        super("To save a report of your Team's Hunted & Gathered Plants, please enter a file path:");

    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Team team = OregonTrail.getCurrentGame().getTeam();
        try {
            TeamControl teamControl = new TeamControl();
            teamControl.printAnimalPlantReport(filePath, team);
        } catch (TeamControlException | IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        this.console.println("\nYour report has been saved as " + filePath);
        return true;
    }
}
