package org.codeforcoffee.yeoldegeometryapp;

/**
 * Created by andreakim on 6/27/16.
 */

//This class is only supposed to calculate the area of a CIRCLE

public class Area {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Area(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public double radius;
    public double area = Math.PI * (radius * radius);

}



