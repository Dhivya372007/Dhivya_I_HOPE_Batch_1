package com.parkinglot.model;

public abstract class Vehicle {
    private String number;

    public Vehicle(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public abstract String getType();
}
