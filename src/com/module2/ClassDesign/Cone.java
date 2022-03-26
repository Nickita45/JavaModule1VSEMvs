package com.module2.ClassDesign;

import com.module2.FactoryBuilder.IFigureWithRadius;

import java.util.Objects;

public class Cone implements IFigureWithRadius {
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
        Cone cylinder = (Cone) o;
        return height == cylinder.height && radius == cylinder.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, radius);
    }

    public Cone(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
    public Cone(int radius) {
        this.radius = radius;
    }
    public Cone() {

    }
    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
    public double getVolume()
    {
        return (Math.PI*radius*radius*height)/3;
    }
    public double getSurfaceArea()
    {
        return getLateralArea()+getBaseArea();
    }
    public double getLateralArea()
    {
        return Math.PI *radius*Math.sqrt(height*height+radius*radius);
    }
    public double getBaseArea()
    {
        return Math.PI*radius*radius;
    }
    public int getHeightByVolume(int volume)
    {
        return (int)(3*volume/(Math.PI*radius*radius));
    }
    public int getRadiusByVolume(int volume)
    {
        return (int)Math.sqrt(3*volume/(Math.PI*radius));
    }

}
