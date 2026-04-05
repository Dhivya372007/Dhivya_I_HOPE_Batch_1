package com.parkinglot.model;

public class Bike extends Vehicle {

    public Bike(String number) {
        super(number);
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
