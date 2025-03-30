package org.gravity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SpacePanel extends JPanel implements MouseListener {

    SpacePanel() {
        this.setBackground(new Color(169, 201, 201));
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
