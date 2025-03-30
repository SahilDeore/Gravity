package org.gravity;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {

        this.setTitle("Gravity");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.setUndecorated(true);

        this.add(new SpacePanel());
        this.add(new SidePanel(), BorderLayout.EAST);

        this.setVisible(true);
    }

}
