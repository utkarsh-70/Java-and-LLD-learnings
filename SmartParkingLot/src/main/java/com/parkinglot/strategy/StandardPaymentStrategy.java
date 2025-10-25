package com.parkinglot.strategy;

import java.time.Duration;

import com.parkinglot.model.ParkingTicket;

public class StandardPaymentStrategy implements PaymentStrategy {
    
    @Override
    public double calculateFee(ParkingTicket ticket) {
        long hours=Math.max(Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours(),1);
        switch (ticket.getVehicle().getVehicleType()) {
            case CAR:
                return hours * 20;
            case BIKE:
                return hours * 10;      
            case BUS:    
                return hours * 50;
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }

}
