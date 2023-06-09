package com.api.parkingcontrol.dto.brand;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BrandDTO {

   @NotBlank
   @Size(max = 70)
   private String brandCar;

}
