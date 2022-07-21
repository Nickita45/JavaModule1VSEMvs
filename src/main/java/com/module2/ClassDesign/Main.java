package com.module2.ClassDesign;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Cylinder cyl = new Cylinder(5,2);
        System.out.println(cyl.getLateralArea());
        System.out.println(cyl.getSurfaceArea());
        System.out.println(cyl.getBaseArea());
        cyl.setHeight(10);
        System.out.println(cyl.getRadiusByVolume(400));
        System.out.println(cyl.getVolume());
        System.out.println(cyl.toString());
    }
}
