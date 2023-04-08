package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int maxLoad;

    public Lorry(String brand, String type, int weight, Driver driver, Engine engine, int maxLoad) {
        super(brand, type, weight, driver, engine);
        this.maxLoad = maxLoad;
    }

    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + maxLoad;
    }
}
