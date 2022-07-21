package com.module2.Inheritance;

public class Main {
    public static void main(String[] args){
        Wall wall = new Wall(200,300);

        wall.setCostForOneMeter(wall.getCountBlockFromOneBlock(30,40));

        System.out.println(wall.getCostForOneMeter());
        System.out.println(wall.costDoubleMeter());
        System.out.println(wall.costTripleMeter());
    }
}
