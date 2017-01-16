package volcano;

import java.util.ArrayList;

public class VolcanoMain {

    public static void main(String[] args){
        //create arraylist of the door patterns to assign
        ArrayList<String> doorPatterns = new ArrayList<String>(8);
        //create individual patterns
        //Note: all patterns need to be the same length. Could add checking for this, but, nah.
        /*doorPatterns.add("1*11**0*02"); //0
        doorPatterns.add("**1*111**1"); //1
        doorPatterns.add("**11*211**"); //2
        doorPatterns.add("*10*1*10**"); //3
        doorPatterns.add("00****0***"); //4
        doorPatterns.add("*01*******"); //5
        doorPatterns.add("*00*1*111*"); //6
        doorPatterns.add("0*11******"); //7*/
        doorPatterns.add("1010**1***"); //0
        doorPatterns.add("******1**1"); //1
        doorPatterns.add("2*10*1****"); //2    fix this to be a 2
        doorPatterns.add("**1***101*"); //3
        doorPatterns.add("*00***111*"); //4
        doorPatterns.add("**01**01**"); //5
        doorPatterns.add("0*11******"); //6
        doorPatterns.add("110*11***0"); //7


        //Create new puzzle using the hard-coded patterns.
        //Puzzle creates doors and orbs based on the patterns provided.
        PuzzleUI theWindow = new PuzzleUI();
        Puzzle thePuzzle = new Puzzle(doorPatterns,theWindow);
        theWindow.puzzleInit(thePuzzle);
        theWindow.addButtons(thePuzzle.orbList);
        theWindow.frame.setVisible(true);
    }

}
