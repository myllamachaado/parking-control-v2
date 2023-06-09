package com.api.parkingcontrol.dto.car;

import com.api.parkingcontrol.models.BrandModel;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegCarDTO {

   @NotBlank
   @Size(max = 70)
   private String modelCar;

   @NotBlank
   @Size(max = 70)
   private String brandCar;

}
