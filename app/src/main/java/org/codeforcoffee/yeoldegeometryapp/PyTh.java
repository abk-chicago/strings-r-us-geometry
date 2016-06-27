package org.codeforcoffee.yeoldegeometryapp;

/**
 * Created by andreakim on 6/27/16.
 */
public class PyTh {
    public double sideA, sideB, sideC;

    public PyTh(double sideA, double sideB, double sideC, int sideSolved) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideSolved = sideSolved;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public int sideSolved;


}
