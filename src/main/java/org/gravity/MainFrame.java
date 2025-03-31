package org.gravity;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    SpacePanel spacePanel;
    SidePanel sidePanel;

    MainFrame() {

        this.setTitle("Gravity");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.setUndecorated(true);

        spacePanel = new SpacePanel(this);
        sidePanel = new SidePanel(this);
        this.add(spacePanel);
        this.add(sidePanel, BorderLayout.EAST);

        this.setVisible(true);
    }

}
