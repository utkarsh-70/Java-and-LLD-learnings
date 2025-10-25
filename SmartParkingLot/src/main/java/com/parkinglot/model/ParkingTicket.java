package com.parkinglot.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double fee;
    // Constructor
    public ParkingTicket( Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
        this.exitTime = null;
        this.fee = 0.0;
    }

    // setter for exit time and fee
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public void setFee(double fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("Fee cannot be negative");
        }
        this.fee = fee;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public double getFee() {
        return fee;
    }
    

}
