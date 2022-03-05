package com.module1.CyclePractice;

public class Main {

    public static void main(String[] args) {

        byte favouriteNumber = 45;
        System.out.println("My favourite number is " +favouriteNumber);

        short birthDate = 1999;
        System.out.println("I was born in" + birthDate);

        int priceHome = 100_000_000;
        System.out.println("I want to buy a house in Spain, but it costs" + priceHome);

        long timeLiveInSecond = (2022-birthDate) * 365 * 24 * 60 * 60;//сколько секунд назад я родился
        System.out.println("I lived for about "+timeLiveInSecond+" seconds");

        float height = 1.76f;
        System.out.println("My height is "+ height + " meters");

        double masterDegreePassed= (double)1/3;
        System.out.println("I passed my " +masterDegreePassed+" master's degree");

        char groupName = 'A';
        System.out.println("My first letter of group is "+ groupName+" and second is D");

        boolean isMale = true;
        System.out.println("Am I a man? Answer - "+isMale);

    }
}
