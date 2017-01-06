package volcano;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by BChilds on 12/26/16.
 */
public class puzzleUI {
    //need to build frame
    //image view in top middle of map
    //need all the buttons at bottom, properly labeled. Horizontally is fine.


    JFrame frame;
    JPanel mainPanel;
    GridBagConstraints gbc;

    //Constructor to set up initial settings
    public void puzzleInit(){
        frame = new JFrame("Volcano Puzzle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel( new GridBagLayout() );
        mainPanel.setPreferredSize( new Dimension( 800, 600) );
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.setVisible(true);
    }

}
