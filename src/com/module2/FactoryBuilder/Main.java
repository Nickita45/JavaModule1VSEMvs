package com.module2.FactoryBuilder;

import com.module2.ClassDesign.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5, 2);
        Cylinder cyl1 = (Cylinder) AbstractFactoryFigureWithRadius.create(5,2,"cylinder");

    }
}
