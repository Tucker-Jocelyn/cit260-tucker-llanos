/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Kim & Jocelyn
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    public View() {   
    }
        
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {

        boolean endOfView = false;
        do {

            String[] inputs = this.getInput();
            String value = inputs[0];
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the view
            
            //do the requestee action and display the next view
            endOfView = this.doAction(inputs);
            
        }   while (endOfView != true); // exit the view when endOFView == true

    }
            
    
    @Override
    public String[] getInput() {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        String[] inputs = new String[1];

        while (valid == false) {

              
            System.out.println("\n" + this.displayMessage);
            
            String option = in.nextLine();
            option = option.trim();

            if (option.length() < 1) {
                System.out.println("You must enter a value, blanks are not accepted here.");
                continue;
            }
                     
            inputs[0] = option;
            valid = true;    
        }
        
       return inputs;
        
        }
    }

