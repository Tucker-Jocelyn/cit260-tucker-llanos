/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

/**
 *
 * @author KIm and Jocelyn
 */
public enum CharacterDefinitions {
    PLAYER("Player", 2, 2, 1),
    KIRK("Kirk", 1, 1, 2),
    BONES("Bones", 3, 1, 1),
    SPOCK("Spock", 2, 0, 2),
    REDSHIRT1("Red Shirt 1", 2, 2, 0),
    REDSHIRT2("Red Shirt 2", 3, 2, 2);

    public final String characterName;
    public final int stamina;
    public final int characterHuntingSkill;
    public final int characterGatheringSkill;

    CharacterDefinitions(String characterName, int stamina, int characterHuntingSkill, int characterGatheringSkill) {
        this.characterName = characterName;
        this.stamina = stamina;
        this.characterHuntingSkill = characterHuntingSkill;
        this.characterGatheringSkill = characterGatheringSkill;
    }

    @Override
    public String toString() {
        return "CharacterDefinitions{" + "characterName=" + characterName + ", stamina=" + stamina + ", characterHuntingSkill=" + characterHuntingSkill + ", characterGatheringSkill=" + characterGatheringSkill + '}';
    }

}
