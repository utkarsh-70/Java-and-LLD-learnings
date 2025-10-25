package com.parkinglot.model;

public class ParkingSpot {
    private String spotId;
    private VehicleType spotType;
    private boolean isAvailable;

    public ParkingSpot(String spotId, VehicleType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.isAvailable = true; 
    }

    public String getSpotId() {
        return spotId;
    }
                    

    public VehicleType getSpotType() {
        return spotType;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}
