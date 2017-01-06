package volcano;

public class Door{
    //define variables
    //door has a state, open or closed (true or false). Doors start closed.
    //door needs a regex pattern for open/closed
    //door has coordinates for top-left pixel to place green square image on open state?
    Boolean doorState;
    String pattern;

    //default constructor
    public Door(){
        doorState = false;
    }

    public Door(String pat){
        doorState = false;
        pattern = pat;
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


    public Boolean checkPattern(String orbLogic, String pat){
        //insert logic to check orbLogic against pattern, character by character. Switch? 2, 1, 0
        //be recursive?

        return match;
    }

}
