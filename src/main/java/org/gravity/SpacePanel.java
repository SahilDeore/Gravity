package org.gravity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import org.gravity.entity.Planet;

public class SpacePanel extends JPanel implements MouseListener {

    private final List<Planet> planets = new ArrayList<>();
    MainFrame mainFrame;
    SidePanel sidePanel;
    Timer timer;

    private static int t = 0;

    SpacePanel(MainFrame mainFrame) {

        this.mainFrame = mainFrame;
        this.sidePanel = this.mainFrame.sidePanel;

        this.setLayout(null);
        this.setBackground(new Color(169, 201, 201));
        this.addMouseListener(this);

        timer = new Timer(16, e -> {
//            System.out.println();
//            System.out.println("T : " + t);
            int index = 0;
            for (Planet p : planets) {
                p.updatePos(planets);
//                System.out.println("P " + index + " x " + p.getX() + " y " + p.getY());
                index++;
            }
            this.revalidate();
            this.repaint();
            t += 1;
        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Planet planet = new Planet(e.getX(), e.getY(), 100, Color.BLACK);
        System.out.println("new p " + planet.getX() + " " + planet.getY());
        planets.add(planet);
        this.add(planet);
        this.revalidate();
        this.repaint();
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

    public void startTimer() {
        System.out.println("STARTING TIMER");
        timer.start();
    }

}
