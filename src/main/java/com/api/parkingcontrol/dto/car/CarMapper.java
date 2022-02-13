package com.api.parkingcontrol.dto.car;

import com.api.parkingcontrol.models.BrandModel;
import com.api.parkingcontrol.models.CarModel;

import java.util.UUID;

public class CarMapper {

   public static CarModel fromDTO(RegCarDTO dto){
      var brand = new BrandModel(dto.getBrandCar());
      return new CarModel(UUID.randomUUID().toString(), dto.getModelCar(), brand);
   }

   public static CarDTO fromEntity(CarModel car){
      return new CarDTO(car.getModelCar(), car.getBrandCar().getBrandCar());
   }

}
