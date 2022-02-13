package com.api.parkingcontrol.exceptions;

public class ParkingSpotInUse extends RuntimeException{

   public ParkingSpotInUse(String message) {
      super(message);
   }

}
