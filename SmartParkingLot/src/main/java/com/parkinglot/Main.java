package com.parkinglot;

import java.util.List;

import com.parkinglot.model.ParkingFloor;
import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.ParkingTicket;
import com.parkinglot.model.Vehicle;
import com.parkinglot.model.VehicleType;
import com.parkinglot.service.ParkingLotService;

public class Main {
    public static void main(String[] args) {
        ParkingSpot spot = new ParkingSpot("A1", VehicleType.CAR);
        ParkingSpot spot2 = new ParkingSpot("B1", VehicleType.BIKE);
        ParkingFloor floor = new ParkingFloor(1, List.of(spot, spot2));
        ParkingLotService parkingLotService = new ParkingLotService(List.of(floor));
        Vehicle vehicle = new Vehicle("XYZ123", VehicleType.CAR);
        ParkingTicket ticket = parkingLotService.assignSpot(vehicle);
        if (ticket != null) {   
            System.out.println("Parking Ticket ID: " + ticket.getTicketId());
        } else {
            System.out.println("No available spot for the vehicle.");
            return;
            }
        try {
            Thread.sleep(2000); // Simulate parking duration
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Sleep interrupted: " + e.getMessage());
        }
        ParkingTicket releasedTicket = parkingLotService.releaseSpot(ticket.getTicketId());
        if (releasedTicket != null) {
            System.out.println("Vehicle exited. Total fee: " + releasedTicket.getFee());
        } else {
            System.out.println("Invalid ticket ID.");
        }       
    }
}
