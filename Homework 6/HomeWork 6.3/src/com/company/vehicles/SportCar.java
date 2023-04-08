package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String type, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, type, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return super.toString()+"\nМаксимальная скорость: " + maxSpeed;
    }
}
