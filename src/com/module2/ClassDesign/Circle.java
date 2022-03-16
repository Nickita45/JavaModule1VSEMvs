package com.module2.ClassDesign;

import java.util.Objects;

public class Circle {
    public int x;
    public int y;

    public int a;
    public int b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Circle(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && a == circle.a && b == circle.b;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, a, b);
    }

    public double getRadius()
    {
        return Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));
    }
}
