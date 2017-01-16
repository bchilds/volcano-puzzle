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
    int[] xes = new int[8];
    int[] yes = new int[8];
    PuzzleUI theUI;

    public Puzzle(ArrayList<String> strings, PuzzleUI puzUI){ //will always have an array of strings to unlock doors
        //x and y coords for greenboxes in doors

        xes[0] = 555;
        xes[1] = 530;
        xes[2] = 655;
        xes[3] = 804;
        xes[4] = 878;
        xes[5] = 929;
        xes[6] = 953;
        xes[7] = 682;

        yes[0] = 282;
        yes[1] = 331;
        yes[2] = 357;
        yes[3] = 305;
        yes[4] = 380;
        yes[5] = 281;
        yes[6] = 357;
        yes[7] = 381;

        numDoors = strings.size();
        numOrbs = strings.get(0).length();
        doorList = new ArrayList<Door>(numDoors);
        for(int i = 0; i<numDoors;i++){
            doorList.add(new Door(strings.get(i),xes[i],yes[i])); //create door with pattern to unlock it
        }
        orbList = new ArrayList<Orb>(numOrbs);
        for(int j = 0; j<numOrbs;j++){
            if(j==6){
                orbList.add(new Orb("Orb " + j, true, this)); //green orb true by default
            } else {
                orbList.add(new Orb("Orb " + j, false, this)); //all orbs false by default
            }
        }

        theUI = puzUI;
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
            door.setState(true); //resets to true, will be invalidated quickly if pattern mismatch
            door.checkPattern(logic, door.pattern);
            //System.out.println(door.getState());
        }
        theUI.RefreshMap(doorList);
    }

}
