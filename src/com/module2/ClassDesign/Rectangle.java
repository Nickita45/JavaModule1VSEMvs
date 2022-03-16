package com.module2.ClassDesign;

import java.util.Objects;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public double getArea()
    {
        return a*b;
    }
    public int getPerimeter()
    {
        return 2*(a+b);
    }
    public double getDiagonal()
    {
        return Math.sqrt((a*a)-(b*b));
    }
    public double getLength()
    {
        return getArea()/a;
    }
    public double getWidth()
    {
        return getArea()/b;
    }
}
