package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, String> {

   Boolean existsByLicensePlateCar(String licensePlateCar);
   Boolean existsByParkingSpotNumber(String parkingSpotNumber);
   Boolean existsByApartmentAndBlock(String apartment, String block);

}
