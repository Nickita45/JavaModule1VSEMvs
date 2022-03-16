package com.module2.ClassDesign;

import java.util.Objects;

public class Rhombus {
    private int a;
    private int d1;
    private int d2;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public Rhombus(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
        this.a = (int)getSideByDiagonals();
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "a=" + a +
                '}';
    }

    public Rhombus(int a) {
        this.a = a;
    }
    public int getPerimeter()
    {
        return 4*a;
    }
    public double getSideByDiagonals()
    {
        return Math.sqrt(d1*d1+d2*d2) / 2;
    }
    public double getArea()
    {
        if(d1 != 0)
            return (d1+d2)/2;
        else
            return 0;
    }
}
