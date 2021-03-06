package OregonTrail.control;

import OregonTrail.model.AnimalsPlants;
import OregonTrail.model.CharacterDefinitions;
import OregonTrail.model.Team;
import OregonTrail.model.Character;
import OregonTrail.model.Ox;
import OregonTrail.model.Wagon;
import exceptions.TeamControlException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kim Llanos v3.3 TeamControl and Jocelyn Tucker
 */
public class TeamControl {

    /**
     * Calculates how much of the hunted animals (in pounds) the team retains.
     *
     * @param teamHuntingSkillLevel
     * @param hasAnimal
     * @return
     */
    public static double calcTeamHuntingIncrease(int teamHuntingSkillLevel, int hasAnimal) throws TeamControlException {

        //basic validity rules: NO hunting skills (level 0), NO animals
        if (teamHuntingSkillLevel < 0 || hasAnimal < 1) {
            throw new TeamControlException("You cannot hunt, because there are no animals, or you do not have the sufficent skill level.");
        }

        double teamAnimalWeight = AnimalsPlants.ANIMAL.weight * hasAnimal;

        if (teamHuntingSkillLevel == 6 || teamHuntingSkillLevel == 5) {
            teamAnimalWeight *= 0.75;
        } else if (teamHuntingSkillLevel == 4 || teamHuntingSkillLevel == 3) {
            teamAnimalWeight *= 0.5;
        } else {
            teamAnimalWeight *= 0.25;
        }

        return teamAnimalWeight;
    }

    /**
     * Calculates how much of the gathered plants (in pounds) the team retains.
     *
     * @param teamGatheringSkillLevel
     * @param hasPlant
     * @return
     */
    public static double calcTeamGatheringIncrease(int teamGatheringSkillLevel, int hasPlant) throws TeamControlException {

        //basic validity rules: NO gathering skills (level 0), NO plants
        if (teamGatheringSkillLevel < 0 || hasPlant < 1) {
            throw new TeamControlException("You cannot gather, because there are no plants, or you do not have the sufficent skill level.");
        }

        double teamPlantWeight = AnimalsPlants.PLANT.weight * hasPlant;

        if (teamGatheringSkillLevel == 6 || teamGatheringSkillLevel == 5) {
            teamPlantWeight *= 0.75;
        } else if (teamGatheringSkillLevel == 4 || teamGatheringSkillLevel == 3) {
            teamPlantWeight *= 0.5;
        } else {
            teamPlantWeight *= 0.25;
        }

        return teamPlantWeight;
    }

    public static Team createTeam() {
        CharacterDefinitions[] charDef = CharacterDefinitions.values();
        Character[] teamMembers = new Character[6];
        for (CharacterDefinitions current : charDef) {
            teamMembers[current.ordinal()] = new Character(current);
        }
        Team team = new Team();
        team.setTeam(teamMembers);
        return team;
    }

    /*array of Char Defn index to get index position within the array
     */
    public static int getCharIndex(String charName) throws TeamControlException {
        CharacterDefinitions[] charDef = CharacterDefinitions.values();

        for (int i = 0; i < charDef.length; i++) {
            if (charDef[i].getCharacterName().equals(charName)) {
                return i;
            }
        }

        throw new TeamControlException("Character not found.");
    }

    public void printTeamWagonOxReport(String filePath, Team team) throws TeamControlException, IOException {
        if (team == null) {
            throw new TeamControlException("Team cannot be null, please create a Team.");
        }
        Wagon wagon = team.getWagon();
        if (wagon == null) {
            throw new TeamControlException("Wagon cannot be null, please choose a Wagon.");
        }
        Ox ox = team.getOx();
        if (ox == null) {
            throw new TeamControlException("Ox cannot be null, please choose a Team of Oxen.");
        }

        try (PrintWriter report = new PrintWriter(filePath)) {
            report.println("\n                        Team Wagon and Oxen Information                       \n");
            report.printf("%n%-20s%-17s%-17s%-15s", "Number of Oxen", "Wagon Weight", "Wagon Length", "Wagon Max Carry Weight");
            report.printf("%n%-20s%-17s%-17s%-15s", ox.getAmount() + " oxen", wagon.getWagonWeight() + " lbs", wagon.getLength() + " ft", wagon.getMaxCarryWeight() + " lbs");
        } 
        catch (IOException ex) {
            throw ex;
        }
    }

    public void printAnimalPlantReport(String filePath, Team team) throws TeamControlException, IOException {
        if (team == null) {
            throw new TeamControlException("Team cannot be null, please create a Team.");
        }
        Wagon wagon = team.getWagon();
        if (wagon == null) {
            throw new TeamControlException("Wagon cannot be null, please choose a Wagon.");
        }
        Ox ox = team.getOx();
        if (ox == null) {
            throw new TeamControlException("Ox cannot be null, please choose a Team of Oxen.");
        }
        try (PrintWriter report = new PrintWriter(filePath)) {
            report.println("\n               Team's Hunted Animals and Gathered Plants Report          \n");
            report.printf("%n%-20s%-17s%-17s%-15s", "Wagon Weight", "Wagon Max Carry Weight", "Weight of Hunted Animals", "Weight of Gathered Plants");
            report.printf("%n%-20s%-17s%-17s%-15s", "Weight of Wagon is " + wagon.getWagonWeight() + "lbs before adding animals & plants", wagon.getMaxCarryWeight() + " lbs", wagon.getAnimalWeight(), wagon.getPlantWeight());
        } catch (IOException ex) {
            throw ex;
        }
    }

}
