package volcano;

import java.util.ArrayList;

public class VolcanoMain {

    public static void main(String[] args){
        //create arraylist of the door patterns to assign
        ArrayList<String> doorPatterns = new ArrayList<String>(8);
        //create individual patterns
        //Note: all patterns need to be the same length. Could add checking for this, but, nah.
        doorPatterns.add("1*11**0*02");
        doorPatterns.add("**1*111**1");
        doorPatterns.add("**11*211**");
        doorPatterns.add("*10*1*10**");
        doorPatterns.add("00****0***");
        doorPatterns.add("*01*******"); //OR (**1**1****)?
        doorPatterns.add("*00*1*111*");
        doorPatterns.add("0*11******");


        //Create new puzzle using the hard-coded patterns.
        //Puzzle creates doors and orbs based on the patterns provided.
        PuzzleUI theWindow = new PuzzleUI();
        Puzzle thePuzzle = new Puzzle(doorPatterns,theWindow);
        theWindow.puzzleInit(thePuzzle);
        theWindow.addButtons(thePuzzle.orbList);
        theWindow.frame.setVisible(true);
    }

}
