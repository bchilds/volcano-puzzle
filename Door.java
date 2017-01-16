package volcano;

import javax.swing.*;
import java.awt.*;

public class Door{
    //define variables
    //door has a state, open or closed (true or false). Doors start closed.
    //door needs a regex pattern for open/closed
    //door has coordinates for top-left pixel to place green square image on open state?
    Boolean doorState;
    String pattern;
    int doorX;
    int doorY;

    //default constructor
    public Door(){
        doorState = false;
    }

    public Door(String pat, int xIn, int yIn){
        doorState = false;
        pattern = pat;
        doorX = xIn;
        doorY = yIn;
    }


    //create door as specific boolean
    public Door(boolean bool){
        doorState = bool;
    }

    //get door state. Will be used for showing green square
    public boolean getState() {
        return doorState;
    }

    public void setState(Boolean b) {
        //sets door to open or closed
        doorState = b;
    }

    public int getDoorX(){
        return doorX;
    }

    public int getDoorY(){
        return doorY;
    }

    public void checkPattern(String string1, String string2) {
        Boolean cont = true;
        if (string1.length() != string2.length()) {
            doorState = false;
            System.out.println("Size mismatch: ");
            System.out.println(string1);
            System.out.println(string2);
        } else {
                for (int i = 0; i < string1.length() && i < string2.length();i++) {
                    if (string1.charAt(i) == '1' && string2.charAt(i) == '2') { //check to see if a 2 is in pattern
                        doorState = true;
                        cont = false;
                        break;

                    }
                }

            for (int i = 0; i < string1.length() && i < string2.length() && doorState && cont; i++) {
                    if (string1.charAt(i) == string2.charAt(i) || string2.charAt(i) == '*') {
                        doorState = true;
                    } else if(string1.charAt(i) != string2.charAt(i) && string2.charAt(i) != '*') {
                        doorState = false;
                        break;
                    }
            }
        }
    }

}
