package com.module2.FactoryBuilder;

import com.module2.ClassDesign.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5, 2);
        Cylinder cyl1 = (Cylinder) AbstractFactoryFigureWithRadius.create(5,2,"cylinder");

        MyInteger myInteger1 = new MyInteger(45);
        System.out.println(myInteger1.isPrime());
        System.out.println(MyInteger.isPrime(myInteger1.getValue()));
        System.out.println(MyInteger.isPrime(3));
        System.out.println(MyInteger.isPrime(43));
        System.out.println(MyInteger.isPrime(97));
        System.out.println(MyInteger.isPrime(98));
    }
}
