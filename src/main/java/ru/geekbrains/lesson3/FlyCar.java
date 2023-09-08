package ru.geekbrains.lesson3;

import java.awt.*;

public class FlyCar extends Car {
    public FlyCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color,fuelType);
        setWheelsCount(4);
    }

    public void fly(){
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
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
}
