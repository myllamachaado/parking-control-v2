package com.api.parkingcontrol.dto.parkingSpot;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegParkingSpotDTO {

   @NotBlank
   private String parkingSpotNumber;

   @NotBlank
   @Size(max = 7)
   private String licensePlateCar;

   @NotBlank
   private String modelCar;

   @NotBlank
   private String colorCar;

   @NotBlank
   private String responsableName;

   @NotBlank
   private String apartment;

   @NotBlank
   private String block;

}
