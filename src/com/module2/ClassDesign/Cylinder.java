package com.module2.ClassDesign;

import java.util.Objects;

public class Cylinder {
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return height == cylinder.height && radius == cylinder.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, radius);
    }

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
    public Cylinder(int radius) {
        this.radius = radius;
    }
    public Cylinder() {

    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
    public double getVolume()
    {
        return Math.PI * radius * radius * height;
    }
    public double getSurfaceArea()
    {
        return getLateralArea() + 2 * getBaseArea();
    }
    public double getLateralArea()
    {
        return 2*Math.PI * radius * height;
    }
    public double getBaseArea()
    {
        return Math.PI * radius * radius;
    }
    public int getHeightByVolume(int volume)
    {
        return (int)(volume/(Math.PI*radius*radius));
    }
    public int getRadiusByVolume(int volume)
    {
        return (int)Math.sqrt(volume/(Math.PI*height));
    }
}
