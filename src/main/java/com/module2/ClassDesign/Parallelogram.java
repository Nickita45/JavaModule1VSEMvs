package com.module2.ClassDesign;

import java.util.Objects;

public class Parallelogram {
    private int a;
    private int b;
    private int c;
    private int d;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return a == that.a && b == that.b && c == that.c && d == that.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public Parallelogram(int base_a, int b, int base_c, int d) {
        this.a = base_a;
        this.b = b;
        this.c = base_c;
        this.d = d;
    }
    public boolean isItParallelogram()
    {
        return a==c && this.b==c;
    }
    public int getPerimeter()
    {
        return a+b+c+d;
    }
    public double getAreaParallegram(int height)
    {
        return height*a;
    }

}
