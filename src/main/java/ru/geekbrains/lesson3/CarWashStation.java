package ru.geekbrains.lesson3;

public class CarWashStation implements Wiping{
    protected String name;
    public CarWashStation(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void wipMirrors() {
        System.out.println("Протерли зеркала!");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Протерли лобовое стекло!");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протерли фонари!");
    }
}
