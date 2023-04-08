package com.company.details;

public class Engine {
    private int power;
    private String producer;

    public Engine(String producer, int power) {
        this.producer = producer;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }
}
