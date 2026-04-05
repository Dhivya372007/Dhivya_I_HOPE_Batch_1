package com.parkinglot.model;

public class ParkingSpot {

    private int id;
    private Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return vehicle != null;
    }

    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void remove() {
        this.vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getId() {
        return id;
    }
}
