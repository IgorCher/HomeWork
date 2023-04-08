package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String type;
    private int weight;
    private Driver driver;
    private Engine engine;
    public Car(String brand, String type, int weight, Driver driver, Engine engine){
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public String toString() {
        return "Марка: "+getBrand()+"\nТип: "+ getType()+"\nВес: " + getWeight()+"\nДвигатель производства: " +
                engine.getProducer()+", мощностью " + engine.getPower() +
                "\nВодитель: "+driver.getName() +" "+ driver.getSurname() +"\nСтаж: "+ driver.getExperience();
    }
}
