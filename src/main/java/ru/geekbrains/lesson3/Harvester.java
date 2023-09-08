package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {


    private Refueling refueling;
    private Wiping wiping;

    public Harvester(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
        System.out.printf("Прибытие на АЗС '%s'\n",refueling.getName());
    }
    public void setCarWahStation(Wiping carwashstation) {
        this.wiping = carwashstation;
        System.out.printf("Прибытие на автомойку '%s'\n",wiping.getName());
    }
    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
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

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }


    @Override
    public void wipMirrors() {
        if (wiping != null){
            wiping.wipMirrors();
        }
    }

    @Override
    public void wipWindshield() {
        if (wiping != null){
            wiping.wipWindshield();
        }
    }

    @Override
    public void wipHeadlights() {
        if (wiping != null){
            wiping.wipHeadlights();
        }
    }
    @Override
    public String getName() {
        return null;
    }

}
