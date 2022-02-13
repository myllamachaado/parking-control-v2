package com.api.parkingcontrol.dto.brand;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BrandDTO {

   @NotBlank
   @Size(max = 70)
   private String brandCar;

}
