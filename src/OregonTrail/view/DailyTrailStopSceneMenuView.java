package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.Random;
import OregonTrail.control.TeamControl;
import exceptions.TeamControlException;

/**
 *
 * @author Kim Llanos
 */
public class DailyTrailStopSceneMenuView extends View {

    public DailyTrailStopSceneMenuView() {
        super("\nHere are your Daily Trail Stop Options:"
                + "\nT - Visit Town\n"
                + "\nF - Visit Fort\n"
                + "\nC - Cross River\n"
                + "\nR - Rest for the Day\n"
                + "\nH - Go Hunting\n"
                + "\nP - Gather Plants\n"
                + "\nA - Print a Report of Team's Current Animal & Plants \n"
                + "\nE - Exit (Back to Main Menu)");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'T':
                this.console.println("T - Visit the Nearby Town\n");
                visitTown();
                break;
            case 'F':
                this.console.println("F - Visit the Nearby Fort\n");
                visitFort();
                break;
            case 'C':
                this.console.println("C - Cross the River\n");
                crossRiver();
                break;
            case 'R':
                this.console.println("R - Rest for the Day\n");
                dailyRest();
                break;
            case 'H':
                this.console.println("H - Hunt for Animals\n");
                goHunting();
                break;
            case 'P':
                this.console.println("G - Gather Edible Plants\n");
                gatherPlants();
                break;
            case 'A':
                this.console.println("A - Printing Report Hunted & Gathered Animals\n");
                runPrintAnimalPlantReport();
                break;
            case 'E':
                this.console.println("E - Exit (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"T, F, C, R, H, P, A, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void visitTown() {
        this.console.println("Go to the Visit Town Scene ");
    }

    private void visitFort() {
        this.console.println("Go to the Visit Fort Scene ");
    }

    private void crossRiver() {
        this.console.println("Go to the Crossing River Scene ");
    }

    private void dailyRest() {
        this.console.println("You Will Now Rest for the Day ");
    }

    private void goHunting() {
        try {
            int numAnimal = Random.range(2, 8);
            int teamSkill = Random.range(3, 6);
            double teamAnimalWeight = TeamControl.calcTeamHuntingIncrease(teamSkill, numAnimal);
            OregonTrail.getCurrentGame().getTeam().getWagon().setAnimalWeight(teamAnimalWeight);
            this.console.println("Based on your team's hunting skill level, your team retains " + teamAnimalWeight + "lbs of hunted animals.");
            this.console.println("\nTo see the new total weight of your wagon, which includes your hunted animals, please run the Wagon Report.");
        } catch (TeamControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void gatherPlants() {
        try {
            int numPlant = Random.range(4, 10);
            int teamSkill = Random.range(3, 6);
            double teamPlantWeight = TeamControl.calcTeamGatheringIncrease(teamSkill, numPlant);
            OregonTrail.getCurrentGame().getTeam().getWagon().setPlantWeight(teamPlantWeight);
            this.console.println("Based on your teams's gathering skill level, your team retaines " + teamPlantWeight + "lbs of gathered plants.");
            this.console.println("\nTo see the new total weight of your wagon, which includes your gathered plants, please run the Wagon Report.");
        } catch (TeamControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void runPrintAnimalPlantReport() {
        TeamAnimalPlantView teamAnimalPlantView = new TeamAnimalPlantView();
        teamAnimalPlantView.display();
    }

}
