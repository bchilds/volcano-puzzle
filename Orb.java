package volcano;

import javax.swing.JToggleButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Orb{

    //declare variables
    private boolean orbState;
    public JToggleButton orbButton;
    public Puzzle inPuzzle;

    //create Orb with a specific value
    public Orb(String name, boolean b, Puzzle puzzle) {
        orbState = b;
        orbButton = new JToggleButton(name,orbState);
        orbButton.addActionListener(new OrbButtonListener());
        inPuzzle = puzzle;
    }

    public String getOrbState() {
        if(orbState){
            return "1";
        } else {
            return "0";
        }
    }

    public void changeOrbState() {
        //set orbState to current button selection
        orbState = orbButton.isSelected();
    }

    class OrbButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //change this orb to be the state that the button is in
            changeOrbState();
            //make the puzzle this orb belongs to update all the doors
            inPuzzle.CheckDoors();
        }
    }
}
