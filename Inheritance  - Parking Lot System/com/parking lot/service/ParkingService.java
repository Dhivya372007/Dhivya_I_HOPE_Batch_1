package com.parkinglot.service;

import com.parkinglot.model.*;
import com.parkinglot.repository.ParkingRepository;
import com.parkinglot.exception.ParkingException;

public class ParkingService {

    private ParkingRepository repo;

    public ParkingService(ParkingRepository repo) {
        this.repo = repo;
    }

    public Ticket park(Vehicle v) throws ParkingException {
        for (ParkingSpot spot : repo.getSpots()) {
            if (!spot.isOccupied()) {
                spot.park(v);
                return new Ticket(v, spot.getId());
            }
        }
        throw new ParkingException("Parking Full");
    }

    public void unpark(String number) throws ParkingException {
        for (ParkingSpot spot : repo.getSpots()) {
            if (spot.isOccupied() &&
                spot.getVehicle().getNumber().equals(number)) {
                spot.remove();
                return;
            }
        }
        throw new ParkingException("Vehicle not found");
    }
}
