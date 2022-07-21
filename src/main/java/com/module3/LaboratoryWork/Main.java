package com.module3.LaboratoryWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAirFlyCost airFly1 = new FlyLowCost(5,1,"Air Up");
        IAirFlyCost airFly2 = new FlyLowCost(7,3,"Mars Up");
        IAirFlyCost airFly3 = new FlyLowCost(6,5,"Camel Case");
        IAirFlyCost airFly4 = new FlyBusinessClass(100,"Five Star");
        IAirFlyCost airFly5 = new FlyBusinessClass(120,"Come on");

        List<IAirFlyCost> list = new ArrayList<>();
        list.add(airFly1);
        list.add(airFly2);
        list.add(airFly3);
        list.add(airFly4);
        list.add(airFly5);

        System.out.println("Total cost: "+list.stream().mapToInt(e -> e.getTicketCost()).sum());
        int max = list.stream().mapToInt(e -> e.getTicketCost()).max().orElse(0);
        System.out.println("Max: "+max);
        int min = list.stream().mapToInt(e -> e.getTicketCost()).min().orElse(0);
        System.out.println("Min: "+min);
        double avg = list.stream().mapToDouble(e -> e.getTicketCost()).average().orElse(0);
        System.out.println("Avg: "+avg);

        int sumLowCostPrice = list.stream().filter(e -> e instanceof FlyLowCost).mapToInt(e -> e.getTicketCost()).sum();
        int sumBusinessClassPrice = list.stream().filter(e -> e instanceof FlyBusinessClass).mapToInt(e -> e.getTicketCost()).sum();
        System.out.println(sumLowCostPrice+"|"+sumBusinessClassPrice);
        System.out.println("Cost is more: "+ (sumLowCostPrice > sumBusinessClassPrice ? "LowCost" : "Business Class"));
    }
}
