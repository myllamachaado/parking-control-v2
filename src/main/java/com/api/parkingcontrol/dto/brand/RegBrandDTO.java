package com.api.parkingcontrol.dto.brand;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegBrandDTO {

   @NotBlank
   private String brandCar;


}
