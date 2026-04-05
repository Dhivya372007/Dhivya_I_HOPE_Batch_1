package com.parkinglot.model;

public class Ticket {

    private static int counter = 1;
    private int ticketId;
    private Vehicle vehicle;
    private int spotId;

    public Ticket(Vehicle vehicle, int spotId) {
        this.ticketId = counter++;
        this.vehicle = vehicle;
        this.spotId = spotId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSpotId() {
        return spotId;
    }

    public void printTicket() {
        System.out.println("Ticket ID: " + ticketId +
                " | Vehicle: " + vehicle.getNumber() +
                " | Spot: " + spotId);
    }
}
