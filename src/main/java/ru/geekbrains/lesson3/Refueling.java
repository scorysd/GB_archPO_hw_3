package ru.geekbrains.lesson3;

/**
 * Заправочная станция
 */
interface Refueling{

    /**
     * Заправка
     */
    void fuel(FuelType fuelType);
    String getName();

}
