/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

/**
 *
 * @author kimta
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("E - Exit Game Play Menu");
    }

    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            
            case 'E':
                System.out.println("E - Exiting the Game Play Menu (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"V, B, S, and E\" are Valid Options\n");
                break;
        }

        return false;
    }
}
