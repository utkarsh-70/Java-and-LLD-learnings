 package com.parkinglot.strategy;

import com.parkinglot.model.ParkingTicket;

public interface PaymentStrategy {
    double calculateFee(ParkingTicket ticket);
    
} 
