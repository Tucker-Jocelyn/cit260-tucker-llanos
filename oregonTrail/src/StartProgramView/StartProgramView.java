/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 /*2-21-18 12:02 am
To DO:
1) resilve error [(endOfView = doAction(inputs);]
2) call new instance of StartProgramView in the main OregonTrail.java file (imports??)
3) continue on with the instructions - left off on Pg. 9 item #6

****so far we are still working on "Q" (quit and exit game play) of the Start Menu
Help Menu
    Game Objective
    How to Move
    Tips
    Return to Previous Menu (which is the Main Menu)
Main Menu
    Start (or return to) Game
    Help Menu
    Save Game
    Exit Main Menu (return to Start Menu)
Start Menu
    Start a New Game
    Reload a Saved Game
    Quit Program (exit game play)
 */


package StartProgramView;

/**
 *
 * @author Jocelyn & Kim
 */
public class StartProgramView {

    public StartProgramView() {
        
       displayStartProgramView();
        {

            boolean endOfView = false;
            do {
                String[] inputs = this.getInputs();

                //check input length
                if (inputs.length < 1) {
                    return;
                }

                //retrieve 1st value in array and convert input to uppercase
                String value = inputs[0];
                value = value.toUpperCase();

                // check to see if the value = "Q" if true, then return
                if (value.equals("Q"));
                {
                    return;
                }


                /*need logic & syntax for "next step", which is:  the do action function we are tyring
                to call (endofView = doAction(inputs); */
                endOfView = doAction(inputs);

            } while (endOfView != true);

        }

        //ENDIF
    }

    private String[] getInputs() {
        System.out.println("*****getInputs() called ***");

        String[] inputs = new String[1];
        inputs[0] = "testInput";

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ***");
        System.out.println("tinputs = " + inputs[0]);

        return true;
    }

    private void displayStartProgramView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


/*private void displayStartProgramView() {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }*/
