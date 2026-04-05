package com.parkinglot.factory;

import com.parkinglot.model.*;

public class VehicleFactory {

    public static Vehicle createVehicle(String type, String number) {
        if (type.equalsIgnoreCase("car"))
            return new Car(number);
        else if (type.equalsIgnoreCase("bike"))
            return new Bike(number);
        else
            return null;
    }
}
