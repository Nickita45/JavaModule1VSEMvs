package com.modele3.LaboratoryWork;

import java.util.Objects;

public class FlyLowCost implements IAirFlyCost{
    public int costForOneKg;
    public int weightLoad;
    public String nameAirPlane;

    public FlyLowCost(int costForOneKg, int weightLoad, String nameAirPlane) {
        this.costForOneKg = costForOneKg;
        this.weightLoad = weightLoad;
        this.nameAirPlane = nameAirPlane;
    }

    public String getNameAirPlane() {
        return nameAirPlane;
    }

    public void setNameAirPlane(String nameAirPlane) {
        this.nameAirPlane = nameAirPlane;
    }

    public int getCostForOneKg() {
        return costForOneKg;
    }

    public void setCostForOneKg(int costForOneKg) {
        this.costForOneKg = costForOneKg;
    }

    public int getWeightLoad() {
        return weightLoad;
    }

    public void setWeightLoad(int weightLoad) {
        this.weightLoad = weightLoad;
    }

    @Override
    public String toString() {
        return "FlyLowCost{" +
                "costForOneKg=" + costForOneKg +
                ", weightLoad=" + weightLoad +
                ", nameAirPlane='" + nameAirPlane + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyLowCost that = (FlyLowCost) o;
        return costForOneKg == that.costForOneKg && weightLoad == that.weightLoad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(costForOneKg, weightLoad);
    }

    @Override
    public int getTicketCost() {
        return this.costForOneKg*this.weightLoad;
    }
}
