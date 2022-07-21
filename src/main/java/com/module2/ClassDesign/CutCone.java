package com.module2.ClassDesign;

import java.util.Objects;

public class CutCone {
    private int height;
    private int R1;
    private int r2;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getR1() {
        return R1;
    }

    public void setR1(int r1) {
        R1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CutCone cutCone = (CutCone) o;
        return height == cutCone.height && R1 == cutCone.R1 && r2 == cutCone.r2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, R1, r2);
    }

    @Override
    public String toString() {
        return "CutCone{" +
                "height=" + height +
                ", R1=" + R1 +
                ", r2=" + r2 +
                '}';
    }

    public CutCone(int height, int r1, int r2) {
        this.height = height;
        this.R1 = r1;
        this.r2 = r2;
    }

    public CutCone() {

    }

    public double getVolume()
    {
        return (1/3 * Math.PI * (R1*R1 + R1*r2 + r2*r2)*height);
    }
    public double getLateralArea()
    {
        return Math.PI * (R1+r2)*Math.sqrt(Math.pow(R1-r2,2)+height*height);
    }
    public double getSurfaceArea()
    {
        return getLateralArea()+Math.PI*(R1*R1+r2*r2);
    }
}
