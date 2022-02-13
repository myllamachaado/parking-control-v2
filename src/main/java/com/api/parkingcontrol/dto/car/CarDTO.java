package com.api.parkingcontrol.dto.car;

import com.api.parkingcontrol.models.BrandModel;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO {

   @NotBlank
   private String modelCar;
   @NotBlank
   private String brandCar;

}
