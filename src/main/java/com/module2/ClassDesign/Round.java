package com.module2.ClassDesign;

import java.util.Objects;

public class Round {
    private int r;

    public int getD() {
        return r;
    }

    public void setD(int d) {
        this.r = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round = (Round) o;
        return r == round.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    public Round(int radius) {
        this.r = radius;
    }

    @Override
    public String toString() {
        return "Round{" +
                "r=" + r +
                '}';
    }
    public double getArea()
    {
        return Math.PI * r * r;
    }
    public double getCircumference()
    {
        return 2* Math.PI * r;
    }
    public double getDiameter()
    {
        return 2*r;
    }
    public double getAreaByDiameter()
    {
        return Math.pow(Math.PI * (1/2 * getDiameter()),2);
    }
    public double getSectorLength(int arcLength)
    {
        return arcLength * 360 / (2*Math.PI * r);
    }
}
