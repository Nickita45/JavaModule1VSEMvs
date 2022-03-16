package com.module2.ClassDesign;

import java.util.Objects;

public class Trapezoid {
    public int a;
    public int b;
    public int c;
    public int d;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Trapezoid(int shorterBase_a, int longerBase_b, int c, int d) {
        this.a = shorterBase_a;
        this.b = longerBase_b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return a == trapezoid.a && b == trapezoid.b && c == trapezoid.c && d == trapezoid.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
    public int getPerimeter()
    {
        return a+b+c+d;
    }
    public double getHeightByCSide()
    {
        return Math.sqrt(c*c - Math.pow(b-a,2));
    }
    public double getHeightByDSide()
    {
        return Math.sqrt(d*d - Math.pow(b-a,2));
    }
    public double getArea()
    {
        return (getHeightByCSide()*(a+b))/2;
    }
    public double getMedianBase()
    {
        return (a+b)/2;
    }
}
