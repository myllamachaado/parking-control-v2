package com.api.parkingcontrol.dto.parkingSpot;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

   @NotNull
   private LocalDateTime registrationDate;

   @NotBlank
   private String block;

}
