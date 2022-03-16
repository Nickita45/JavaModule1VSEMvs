package com.module2.ClassDesign;

import java.util.Objects;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public int getPerimeter()
    {
        return a+b+c;
    }

    public double getAreaValue(int height)
    {
        return (b*height)/2;
    }
    public double getPoluPerimetr()
    {
        return getPerimeter()/2;
    }
    public double getAreaByFormulaGerona()
    {
        double p = getPoluPerimetr();
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
    public double getRadiusCircleIn()
    {
        return getAreaByFormulaGerona()/getPoluPerimetr();
    }
    public double getRadiusCircleOut()
    {
        return (a*b*c)/(4*getAreaByFormulaGerona());
    }
}
