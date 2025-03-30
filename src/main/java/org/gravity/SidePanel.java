package org.gravity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidePanel extends JPanel implements ActionListener {

    SidePanel() {
        this.setBackground(new Color(91, 91, 91));
        this.setPreferredSize(new Dimension(300, 1000));
        this.setLayout(null);

        JButton button = new JButton("Start");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(50, 100, 100, 50);

        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
