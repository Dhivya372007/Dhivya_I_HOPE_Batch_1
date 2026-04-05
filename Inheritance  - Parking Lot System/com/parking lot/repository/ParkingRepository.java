package com.parkinglot.repository;

import com.parkinglot.model.ParkingSpot;

public class ParkingRepository {
    private ParkingSpot[] spots;

    public ParkingRepository(int size) {
        spots = new ParkingSpot[size];
        for (int i = 0; i < size; i++) {
            spots[i] = new ParkingSpot(i + 1);
        }
    }

    public ParkingSpot[] getSpots() {
        return spots;
    }
}
