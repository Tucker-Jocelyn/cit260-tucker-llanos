/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Character;

/**
 *
 * @author Kim Llanos & Jocelyn Tucker
 */
public class CharacterControl {

    public static Character[] createCharacters() {
        Character[] characters = new Character[6];//actors = create an array Actor objects

        Character playersCharacter = new Character(OregonTrail.currentPlayer.getName(), 2, 2, 1, true, 100, 400, 2); //actor1 ****** Need to retrieve player's name correctly
        characters[0] = playersCharacter;//Assign actor1 to the next position in the actors array

        Character bob = new Character("Bob", 1, 1, 2, true, 100, 300, 1); //actor2
        characters[1] = bob;//Assign actor2 to the next position in the actors array

        Character sarah = new Character("Sarah", 3, 1, 1, true, 100, 350, 3); //actor3
        characters[2] = sarah;//Assign actor3 to the next position in the actors array

        Character tom = new Character("Tom", 2, 0, 2, true, 100, 450, 2); //actor4
        characters[3] = tom;//Assign actor4 to the next position in the actors array

        Character rebecca = new Character("Rebecca", 2, 2, 0, true, 100, 375, 2); //actor5
        characters[4] = rebecca;//Assign actor5 to the next position in the actors array

        Character jorge = new Character("Jorge", 3, 2, 2, true, 100, 300, 3); //actor6
        characters[5] = playersCharacter;//Assign actor6 to the next position in the actors array

        return characters;
    }
}
