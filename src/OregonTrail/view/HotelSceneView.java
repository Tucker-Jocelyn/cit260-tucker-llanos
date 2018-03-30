package OregonTrail.view;

import static OregonTrail.control.TeamControl.getCharIndex;
import OregonTrail.model.CharacterDefinitions;
import exceptions.TeamControlException;

/**
 *
 * @author Kim Tanton
 */
public class HotelSceneView extends View {

    public HotelSceneView() {
        super("\nWelcome to the Hotel! Please select an option to either Display, Search, Add, or Delete a Character fron your Team.\n"
                + "\nE - Please Choose and Option:\n"
                + "\nD - Displays listing of all Characters.\n"
                + "\nL - Displays list of Available Characters, which can be added to your Team.\n"
                + "\nS - Search for Characters.\n"
                + "\nA - Add a Character to your Team.\n"
                + "\nX - Delete a Character from your Team.\n"
                + "\nR - Relplace a Character on your Team.\n"
                + "\nE - Exit (Back to Main Menu)");
    }

    public String getName() {

        boolean valid = false;
        String name = null;

        try {
            // while a valid input has not been retrieved
            while (valid == false) {
                this.console.println("\nPlease enter a Character Name. Bones, Spock, Kirk, Red Shirt 1 and Redshirt 2 are valid. ");

                name = this.keyboard.readLine();
                name = name.trim();

                if (name.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "You must enter a value, blanks are not accepted here.");

                    continue;
                }

                valid = true;

            }
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return name;
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'D':
                this.console.println("D - View A Listing of Every Game Character\n");
                allCharacters();
                return true;
            case 'L':
                this.console.println("L - View A Listing Available Characters Only\n");
                availableCharacters();
                return true;
            case 'S':
                searchCharacters();
                this.console.println("S - Search for a Character\n");
                return true;
            case 'A':
                this.console.println("A - Add a Character to your Team\n");
                addCharacter();
                return true;
            case 'X':
                this.console.println("X - Subtract a Character from your Team\n");
                deleteCharacter();
                return true;
            case 'R':
                this.console.println("R - Replace a Character on your Team\n");
                replaceCharacter();
                return true;
            case 'E':
                this.console.println("E - Exit (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"D, L, S, , A, X, R, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    //call getCharIndex() to get character index position and associated character name
    private void searchCharacters() {
        String charToFind = getName();
        int index = 0;
        try {
            index = getCharIndex(charToFind);
        } catch (TeamControlException ex) {
            //Logger.getLogger(HotelSceneView.class.getName()).log(Level.SEVERE, null, ex);
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        if (index == -1) {
            ErrorView.display(this.getClass().getName(), charToFind + " could not be found");
        } else {
            CharacterDefinitions found = CharacterDefinitions.values()[index];
            this.console.println(found.getCharacterName() + " is found at index " + index);
        }
    }

    private void availableCharacters() {
        AvailableCharactersView availableCharactersView = new AvailableCharactersView();
        availableCharactersView.display();
    }

    //add logic for user to input a name to see if they are available
    private void allCharacters() {
        SearchCharactersView searchCharactersView = new SearchCharactersView();
        searchCharactersView.display();
    }

    private void addCharacter() {
        AddCharactersView addCharactersView = new AddCharactersView();
        addCharactersView.display();

    }

    private void deleteCharacter() {
        DeleteCharacterView deleteCharacterView = new DeleteCharacterView();
        deleteCharacterView.display();
    }

    private void replaceCharacter() {
        ReplaceCharacterView replaceCharacterView = new ReplaceCharacterView();
        replaceCharacterView.display();
    }

}
