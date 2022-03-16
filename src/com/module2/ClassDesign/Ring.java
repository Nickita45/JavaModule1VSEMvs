package com.module2.ClassDesign;

import java.util.Objects;

public class Ring {
    private int R;
    private int r;

    public Ring(int r, int r1) {
        R = r;
        this.r = r1;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ring ring = (Ring) o;
        return R == ring.R && r == ring.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(R, r);
    }

    @Override
    public String toString() {
        return "Ring{" +
                "R=" + R +
                ", r=" + r +
                '}';
    }
    public double getArea()
    {
        return getBigAreaCircle() - getSmallAreaCircle();
    }
    public double getSmallDiameter()
    {
        return r/2;
    }
    public double getBigDiameter()
    {
        return R/2;
    }
    public double getSmallAreaCircle()
    {
        return Math.PI * r * r;
    }
    public double getBigAreaCircle()
    {
        return Math.PI * R * R;
    }
}
