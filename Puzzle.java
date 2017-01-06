package volcano;

import java.util.ArrayList;

/**
 * Created by BChilds on 1/5/17.
 */
public class Puzzle {
    //contains the current logic String
    //contains an ArrayList of Doors and ArrayList of Orbs
    //will pass itself in to each Orb that gets created and added into the list of Orbs, as each orb belongs to this puzzle
    //contains a method to get the current logic String from the array of Orbs (should be public)
    //contains a method to check the current logic string against that of each door in doorList

    String logic;
    ArrayList<Door> doorList;
    ArrayList<Orb> orbList;
    int numDoors;
    int numOrbs;

    public Puzzle(ArrayList<String> strings){ //will always have an array of strings to unlock doors
        numDoors = strings.size();
        numOrbs = strings.get(0).length();
        doorList = new ArrayList<Door>(numDoors);
        for(int i = 0; i<numDoors-1;i++){
            doorList.add(new Door(strings.get(i))); //create door with pattern to unlock it
        }
        orbList = new ArrayList<Orb>(numOrbs);
        for(int j = 0; j<numOrbs-1;j++){
            orbList.add(new Orb("Orb " + j, false,this)); //all orbs false by default
        }
    }

    public void GetLogic(){
        logic = ""; //clears logic left over from previous state
        for(Orb orb: orbList){//for each orb in the array, get its state and add it on to the string
            logic = logic + orb.getOrbState(); //append orb state to the new logic string for comparison to door pattern
        }
    }

    public void CheckDoors(){
        GetLogic();
        for (Door door: doorList) {
            door.checkPattern(logic, door.pattern);
        }
    }

}
