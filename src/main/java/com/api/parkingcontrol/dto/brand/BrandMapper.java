package com.api.parkingcontrol.dto.brand;

import com.api.parkingcontrol.models.BrandModel;

import java.util.UUID;

public class BrandMapper {

   public static BrandModel fromDTO(RegBrandDTO dto){
      return new BrandModel(UUID.randomUUID().toString(), dto.getBrandCar());
   }

   public static BrandDTO fromEntity(BrandModel brand){
      return new BrandDTO(brand.getBrandCar());
   }

}
