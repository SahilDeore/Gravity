package org.gravity.entity;

import org.gravity.Gravity;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Planet extends JPanel {

    Gravity gravity = new Gravity();

    public double getXpos() {
        return xpos;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    int x;
    double xpos;
    int y;
    double ypos;

    double mass;
    int diameter = 20;

    double dx;
    double dy;

    Color color;
    private Planet planet;

//    public Planet(int x, int y) {
//        this.x = (int) (x-(diameter/2.0));
//        this.y = (int) (y-(diameter/2.0));
//        this.dx = 0;
//        this.dy = 1;
//        this.color = Color.BLACK;
//        this.setOpaque(false);
//        this.setBounds(this.x, this.y, diameter, diameter);
//    }

    public Planet(int x, int y, int mass, Color color) {
        this.x = (int) (x-(this.diameter/2.0));
        this.y = (int) (y-(this.diameter/2.0));
        this.xpos = this.x;
        this.ypos = this.y;
        this.dx = 0;
        this.dy = 0;
        this.mass = mass;
        this.color = color;
        this.setBackground(color);
        this.setOpaque(false);
        this.setBounds(this.x, this.y, this.diameter, this.diameter);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.color);
        g.fillOval(0, 0, this.diameter, this.diameter);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void updatePos(List<Planet> planets) {

        updateVel(planets);

        this.xpos = (this.xpos + this.dx);
        this.ypos = (this.ypos + this.dy);
        this.x = (int) this.xpos;
        this.y = (int) this.ypos;
        this.setBounds(this.x, this.y, this.diameter, this.diameter);
    }

    public void updateVel(List<Planet> planets) {

        for(Planet p : planets) {
            if(p == this) {
                continue;
            }

            Gravity g = new Gravity();
            g.setGravity(this, p);

            this.dx += g.getForceX()/this.mass;
            this.dy += g.getForceY()/this.mass;

        }

    }

//    public Gravity calculateGravity(Planet p1, Planet p2) {
//
//        Gravity g = new Gravity();
//
//        g.setGravity(p1.mass, p1.xpos, p1.ypos, p2.mass, p2.xpos, p2.ypos);
//
//        return g;
//    }

}
