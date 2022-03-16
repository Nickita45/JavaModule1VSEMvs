package com.module2.ClassDesign;

import java.util.Objects;

public class RectangularBox {
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

    public RectangularBox(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularBox that = (RectangularBox) o;
        return height == that.height && width == that.width && length == that.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length);
    }

    @Override
    public String toString() {
        return "RectangularBox{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
    public int getVolume()
    {
        return width*length*height;
    }
    public int getTotalSurfaceArea()
    {
        return 2*(width*length + width*height + height*length);
    }
    public int getLateralSurfaceArea()
    {
        return 2*(width*height+height*length);
    }
    public double getDiagonal()
    {
        return Math.sqrt(length*length+width*width+height*height);
    }
    public int getPerimeter()
    {
        return 2*(length*width);
    }
}
