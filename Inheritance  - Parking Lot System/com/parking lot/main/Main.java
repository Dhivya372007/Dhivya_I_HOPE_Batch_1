package com.parkinglot.main;

import com.parkinglot.service.ParkingService;
import com.parkinglot.repository.ParkingRepository;
import com.parkinglot.factory.VehicleFactory;
import com.parkinglot.model.Vehicle;
import com.parkinglot.model.Ticket;
import com.parkinglot.exception.ParkingException;
import com.parkinglot.util.Validator;

public class Main {
    public static void main(String[] args) {

        ParkingRepository repo = new ParkingRepository(3);
        ParkingService service = new ParkingService(repo);

        try {
            Vehicle v1 = VehicleFactory.createVehicle("car", "TN01-1111");
            Vehicle v2 = VehicleFactory.createVehicle("bike", "TN02-2222");

            if (Validator.isValidNumber(v1.getNumber())) {
                Ticket t1 = service.park(v1);
                t1.print();
            }

            Ticket t2 = service.park(v2);
            t2.print();

            service.unpark("TN01-1111");

        } catch (ParkingException e) {
            System.out.println(e.getMessage());
        }
    }
}
