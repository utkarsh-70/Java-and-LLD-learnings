package com.parkinglot.model;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;
    public Vehicle(String vehicleNUmber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNUmber;
        this.vehicleType = vehicleType;
    }
    public String getVehicleNUmber() {
        return vehicleNumber;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    
}
