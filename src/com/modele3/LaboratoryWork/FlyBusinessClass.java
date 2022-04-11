package com.modele3.LaboratoryWork;

import java.util.Objects;

public class FlyBusinessClass implements IAirFlyCost{
    private int costTicket;
    public String nameAirPlane;

    public FlyBusinessClass(int costTicket, String nameAirPlane) {
        this.costTicket = costTicket;
        this.nameAirPlane = nameAirPlane;
    }

    public String getNameAirPlane() {
        return nameAirPlane;
    }

    public void setNameAirPlane(String nameAirPlane) {
        this.nameAirPlane = nameAirPlane;
    }

    public int getCostTicket() {
        return costTicket;
    }

    public void setCostTicket(int costTicket) {
        this.costTicket = costTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyBusinessClass that = (FlyBusinessClass) o;
        return costTicket == that.costTicket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(costTicket);
    }

    @Override
    public String toString() {
        return "FlyBusinessClass{" +
                "costTicket=" + costTicket +
                ", nameAirPlane='" + nameAirPlane + '\'' +
                '}';
    }

    @Override
    public int getTicketCost() {
        return this.getCostTicket();
    }
}
