package com.api.parkingcontrol.exceptions;

public class ParkingSpotAlreadyRegistred extends RuntimeException{

   public ParkingSpotAlreadyRegistred(String message) {
      super(message);
   }

}
