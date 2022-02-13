package com.api.parkingcontrol.dto.brand;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegBrandDTO {

   @NotBlank
   private String brandCar;


}
