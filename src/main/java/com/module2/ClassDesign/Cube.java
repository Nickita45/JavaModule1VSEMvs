package com.module2.ClassDesign;

import java.util.Objects;

public class Cube {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return a == cube.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }
    public double getVolume()
    {
        return a*a*a;
    }
    public double getSurfaceArea()
    {
        return 6*a*a;
    }
    public double getDiagonal()
    {
        return Math.sqrt(3)*a;
    }
    public double getEdgesByVolume(int Volume)
    {
        return Math.pow(Volume,1/3);
    }
    public int getArea()
    {
        return a*a;
    }
}
