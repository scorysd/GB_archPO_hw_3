package ru.geekbrains.lesson3;

import java.awt.*;

public class SchoolBus extends Car implements Fueling, Wiping {

    private Refueling refueling;
    private Wiping wiping;

    public SchoolBus(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
        System.out.printf("Прибытие на АЗС '%s'\n", refueling.getName());
    }

    public void setCarWahStation(Wiping carwashstation) {
        this.wiping = carwashstation;
        System.out.printf("Прибытие на автомойку '%s'\n", wiping.getName());
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
}
