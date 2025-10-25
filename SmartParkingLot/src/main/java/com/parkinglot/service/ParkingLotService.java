package com.parkinglot.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.parkinglot.strategy.*;
import com.parkinglot.model.ParkingFloor;
import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.ParkingTicket;
import com.parkinglot.model.Vehicle;
import com.parkinglot.strategy.StandardPaymentStrategy;
public class ParkingLotService {
    private List<ParkingFloor> floors;
    private Map<String,ParkingTicket> activeTickets=new HashMap<>();
    public ParkingLotService(List<ParkingFloor> floors) {
        this.floors = floors;
    }
    public synchronized ParkingTicket assignSpot(Vehicle vehicle){
        for(ParkingFloor floor:floors){
            for(ParkingSpot spot:floor.getSpots()){
                if(spot.isAvailable() && spot.getSpotType()==vehicle.getVehicleType()){
                    spot.setAvailable(false);
                    ParkingTicket ticket=new ParkingTicket(vehicle,spot);
                    activeTickets.put(ticket.getTicketId(), ticket);
                    return ticket;
                }
            }
        }
        return null; // No available spot
    }
    public synchronized ParkingTicket releaseSpot(String ticketId){
        ParkingTicket ticket=activeTickets.get(ticketId);
        if(ticket!=null){
            ParkingSpot spot=ticket.getSpot();
            spot.setAvailable(true);
            ticket.setExitTime(java.time.LocalDateTime.now());
            PaymentStrategy paymentStrategy = new StandardPaymentStrategy();
            ticket.setFee( paymentStrategy.calculateFee(ticket));
            
            return ticket;
        }
        return null; 
    }
    
}
