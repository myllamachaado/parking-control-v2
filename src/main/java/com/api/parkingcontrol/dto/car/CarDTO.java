package com.api.parkingcontrol.dto.car;

import com.api.parkingcontrol.dto.brand.BrandDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {

   @NotBlank
   private String modelCar;
   private BrandDTO brandCar;

}
