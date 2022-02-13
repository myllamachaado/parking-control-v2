package com.api.parkingcontrol.dto.parkingSpot;

import com.api.parkingcontrol.dto.car.CarDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParkingSpotDTO {

   @NotBlank
   private String parkingSpotNumber;

   @NotBlank
   @Size(max = 7)
   private String licensePlateCar;

   @NotBlank
   private CarDTO modelCar;

   @NotBlank
   private String colorCar;

   @NotBlank
   private String responsableName;

   @NotBlank
   private String apartment;

   @NotBlank
   private String block;

}
