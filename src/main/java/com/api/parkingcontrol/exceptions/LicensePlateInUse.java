package com.api.parkingcontrol.exceptions;

public class LicensePlateInUse extends RuntimeException{

   public LicensePlateInUse(String message) {
      super(message);
   }

}
