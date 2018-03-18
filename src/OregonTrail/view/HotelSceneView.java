/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import static OregonTrail.control.TeamControl.getCharIndex;
import OregonTrail.model.CharacterDefinitions;
import java.util.Scanner;

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

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'D':
                System.out.println("D - View A Listing of Every Game Character\n");
                allCharacters();
                return true;
            case 'L':
                System.out.println("L - View A Listing Available Characters Only\n");
                availableCharacters();
                return true;
            case 'S':
                searchCharacters();
                System.out.println("S = Search for a Character\n");
                return true;
            case 'A':
                System.out.println("A = Add a Character to your Team\n");
                addCharacter();
                return true;
            case 'X':
                System.out.println("X = Subtract a Character from your Team\n");
                deleteCharacter();
                return true;
            case 'R':
                System.out.println("R = Replace a Character on your Team\n");
                replaceCharacter();
                return true;
            case 'E':
                System.out.println("E = Exit (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"D, L, S, , A, X, R, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void allCharacters() {
        ListCharactersView listCharactersView = new ListCharactersView();
        listCharactersView.displayListCharactersView();
    }

    private void availableCharacters() {
        AvailableCharactersView availableCharactersView = new AvailableCharactersView();
        availableCharactersView.displayAvailableCharactersView();
    }

    //call getCharIndex() to get character index position and associated character name
    private void searchCharacters() {
        System.out.println("*** searchCharacters() called ***");
        String charToFind = "Bones";
        int index = getCharIndex(charToFind);
        if (index == -1) {
            System.out.println(charToFind + " could not be found");
        } else {
            CharacterDefinitions found = CharacterDefinitions.values()[index];
            System.out.println(found.getCharacterName() + " is found at index " + index);
        }
    }

    private void addCharacter() {
        AddCharactersView addCharactersView = new AddCharactersView();
        addCharactersView.displayAddCharactersView();

    }

    private void deleteCharacter() {
        DeleteCharacterView deleteCharacterView = new DeleteCharacterView();
        deleteCharacterView.displayDeleteCharacterView();
    }

    private void replaceCharacter() {
        ReplaceCharacterView replaceCharacterView = new ReplaceCharacterView();
        replaceCharacterView.displayReplaceCharacterView();
    }

}
