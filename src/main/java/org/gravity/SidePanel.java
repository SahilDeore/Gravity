package org.gravity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidePanel extends JPanel implements ActionListener {

    JButton startButton;
    SpacePanel spacePanel;
    MainFrame mainFrame;

    SidePanel(MainFrame mainFrame) {

        this.mainFrame = mainFrame;
        this.spacePanel = this.mainFrame.spacePanel;

        this.setBackground(new Color(91, 91, 91));
        this.setPreferredSize(new Dimension(300, 1000));
        this.setLayout(null);

        startButton = new JButton("Start");
        startButton.addActionListener(this);
        startButton.setFocusable(false);
        startButton.setBounds(50, 100, 100, 50);

        this.add(startButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton) {
            System.out.println("starting");
            spacePanel.startTimer();
            startButton.setEnabled(false);
        }
    }
}
