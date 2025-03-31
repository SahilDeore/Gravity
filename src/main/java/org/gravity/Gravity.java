package org.gravity;

import org.gravity.entity.Planet;

public class Gravity {

    static final int G = 1;

    public double getForceX() {
        return forceX;
    }

    public void setForceX(double forceX) {
        this.forceX = forceX;
    }

    public double getForceY() {
        return forceY;
    }

    public void setForceY(double forceY) {
        this.forceY = forceY;
    }

    double forceX;
    double forceY;

    public Gravity() {

    }

    public void setGravity(Planet p1, Planet p2) { // takes mass and position of both objects and updates gravity acting on object1 by object2

        double m1 = p1.getMass();
        double x1 = p1.getX();
        double y1 = p1.getY();
        double m2 = p2.getMass();
        double x2 = p2.getX();
        double y2 = p2.getY();

        double r = Math.sqrt(Math.abs((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)));

        if(r < (p1.getDiameter() + p2.getDiameter())) {
            this.setForceY(0);
            this.setForceX(0);
            return;
        }

        double force = (G * m1 * m2) / (r * r);

        double Fx = force * ((x2 - x1) / (r));

        double Fy = force * ((y2 - y1) / (r));

        this.setForceX(Fx);
        this.setForceY(Fy);

    }
}
