/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.RiverCrossingControl;
import OregonTrail.control.SceneControl;
import java.util.Scanner;

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
                + "\nE - Exit (Back to Main Menu)");
    }
    
@Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'T':
                System.out.println("T - Visit the Nearby Town\n");
                visitTown();
                break;
            case 'F':
                System.out.println("F - Visit the Nearby Fort\n");
                visitFort();
                break;
            case 'C':
                System.out.println("C - Cross the River\n");
                crossRiver();
                break;
            case 'R':
                System.out.println("R - Rest for the Day\n");
                dailyRest();
                break;
            case 'H':
                System.out.println("H - Hunt for Animals\n");
                goHunting();
                break;
            case 'P':
                System.out.println("G = Gather Edible Plants\n");
                gatherPlants();
                return true;
            case 'E':
                System.out.println("E = Exit (Back to Main Menu)\n");
                return true;
            default:
                System.out.println("Only \"T, F, C, R, H, P, and E\" are Valid Options\n");
                break;
        }
        return false;
    }

    private void visitTown() {
        System.out.println("Go to the Visit Town Scene ");
    }

    private void visitFort() {
        System.out.println("Go to the Visit Fort Scene ");
    }

    private void crossRiver() {
        System.out.println("Go to the Crossing River Scene ");
    }

    private void dailyRest() {
        System.out.println("You Will Now Rest for the Day ");
    }

    private void goHunting() {
        System.out.println("Go to the Hunt for Animals Scene ");
    }

    private void gatherPlants() {
        System.out.println("Go to the Garher Edible Plants Scene ");
    }

}