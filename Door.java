package volcano;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Door {
    //define variables
    //door has a state, open or closed (true or false). Doors start closed.
    //door needs a regex pattern for open/closed
    //door has coordinates for top-left pixel to place green square image on open state
    Boolean doorState;
    String pattern;

    //default constructor
    public Door(){
        doorState = false;
    }

    //create door as specific boolean
    public Door(boolean bool){
        doorState = bool;
    }

    public boolean getState() {
        return doorState;
    }

    public void changeState() {
        //either opens or closes a door
        doorState = !doorState;
    }

    public void setPattern(String pat){
        pattern = pat;
    }

    public void checkPattern(String pat){
        assert(pattern != null); //pattern should never be null by this point

    }

}
