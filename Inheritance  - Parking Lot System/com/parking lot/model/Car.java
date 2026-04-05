package com.parkinglot.model;

public class Car extends Vehicle {

    public Car(String number) {
        super(number);
    }

    @Override
    public String getType() {
        return "Car";
    }
}
