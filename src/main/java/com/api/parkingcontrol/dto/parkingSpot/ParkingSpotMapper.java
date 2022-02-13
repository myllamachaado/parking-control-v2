package com.api.parkingcontrol.dto.parkingSpot;

import com.api.parkingcontrol.dto.car.CarMapper;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.models.ParkingSpotModel;


public class ParkingSpotMapper {

   public static ParkingSpotModel fromDTO(RegParkingSpotDTO dto){
      CarModel car = new CarModel(dto.getModelCar());

      return new ParkingSpotModel(null, dto.getParkingSpotNumber(), dto.getLicensePlateCar(),
              car, dto.getColorCar(), null, dto.getResponsableName(),
              dto.getApartment(), dto.getBlock());
   }

   public static ParkingSpotDTO fromEntity(ParkingSpotModel parkingSpotModel){
      return new ParkingSpotDTO(parkingSpotModel.getParkingSpotNumber(),
              parkingSpotModel.getLicensePlateCar(),
              CarMapper.fromEntity(parkingSpotModel.getModelCar()),
              parkingSpotModel.getColorCar(), parkingSpotModel.getResponsableName(),
              parkingSpotModel.getApartment(), parkingSpotModel.getBlock());
   }

}
