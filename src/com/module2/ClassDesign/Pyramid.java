package com.module2.ClassDesign;

import java.util.Objects;

public class Pyramid {
    private int height;
    private int width;
    private int length;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Pyramid(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid that = (Pyramid) o;
        return height == that.height && width == that.width && length == that.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length);
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
    public double getVolume()
    {
        return length*width*height/3;
    }
    public double getSurfaceArea()
    {
        return getBaseArea()+getLateralArea();
    }
    public double getLateralArea()
    {
        return length*Math.sqrt(Math.pow(width/2,2)+height*height)+width*Math.sqrt(Math.pow(length/2,2)+height*height);
    }
    public double getBaseArea()
    {
        return length*width;
    }
}
