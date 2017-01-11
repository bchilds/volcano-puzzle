package volcano;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by BChilds on 12/26/16.
 */
public class PuzzleUI {
    //need to build frame
    //image view in top middle of map
    //need all the buttons at bottom, properly labeled. Horizontally is fine.


    JFrame frame;
    JPanel  buttonPanel;
    GridBagConstraints gbc;
    Puzzle thePuzzle;
    MapPanel theMap;

    //Init method, for use post-constructor
    public void puzzleInit(Puzzle puz){
        frame = new JFrame("Volcano Puzzle");
        frame.setSize(new Dimension(1200,700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonPanel = new JPanel( new GridBagLayout() );
        //buttonPanel.setPreferredSize( new Dimension( 1000, 700) );
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.getContentPane().add(BorderLayout.SOUTH,buttonPanel);
        theMap = new MapPanel();
        frame.getContentPane().add(BorderLayout.CENTER, theMap);
        frame.setLocationRelativeTo(null);
        thePuzzle = puz;
    }

    public void addButtons(ArrayList<Orb> orbs){
        for(Orb orb : orbs){
            buttonPanel.add(orb.getOrbButton());
        }
    }

    class MapPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) { //new thoughts - need way to account for doors being open or closed here
            /*Image map = new ImageIcon("src/volcano/VolcPuz.png").getImage();
            g.drawImage(map, 105, 10, this);*/
            for(Door door : thePuzzle.returnDoors()) {
                g.setColor(Color.GREEN);
                g.drawRect(door.getDoorX(), door.getDoorY(), 23, 23);
                System.out.println(door.getDoorX() + " " + door.getDoorY());
            }

            //draw green rectangles for open doors
            for(Door door : thePuzzle.returnDoors()){
                if(door.getState()){
                    g.setColor(Color.GREEN);
                    g.drawRect(door.getDoorX(),door.getDoorY(),23,23);
                }
            }
        }
    }

    public void RefreshMap(){
        System.out.println("Refresh");
        frame.remove(theMap);
        theMap = new MapPanel();
        frame.getContentPane().add(BorderLayout.CENTER, theMap);
        frame.revalidate();
        frame.repaint();
    }
}
