package volcano;

import javax.swing.*;
import java.awt.*;

public class Door{
    //define variables
    //door has a state, open or closed (true or false). Doors start closed.
    //door needs a regex pattern for open/closed
    //door has coordinates for top-left pixel to place green square image on open state?
    static Boolean doorState;
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

    static void checkPattern(int i, String string1, String string2) {
    //Probably not supposed to use doorState in here, but, oh well. Checks pattern and sets door state.
        if (string1.length() != string2.length()) {
            doorState = false;
            System.out.println("Size mismatch: " );
            System.out.println(string1);
            System.out.println(string2);
        } else {
                if ((i < string1.length()) && (i < string2.length()) && doorState) {
                    //if the door value is 2 and the char at this point is 1, be open regardless of everything else
                    if ((string1.charAt(i) == '1' && (string2.charAt(i) == '2'))) {
                        doorState = true;
                    } else {
                        //if the two match or there's an * in the door pattern, continue on
                        if ((string1.charAt(i) == string2.charAt(i)) || (string2.charAt(i) == '*')) {
                            i++;
                            doorState = true;
                            checkPattern(i, string1, string2);
                        } else {
                            doorState = false;
                        }
                    }
                }

        }

    }




}


