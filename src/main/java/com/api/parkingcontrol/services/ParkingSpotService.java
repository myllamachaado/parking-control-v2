package com.api.parkingcontrol.services;

import com.api.parkingcontrol.exceptions.LicensePlateInUse;
import com.api.parkingcontrol.exceptions.ParkingSpotAlreadyRegistred;
import com.api.parkingcontrol.exceptions.ParkingSpotInUse;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ParkingSpotService {

   private final ParkingSpotRepository parkingSpotRepository;

   @Transactional
   public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){

      if(this.existsByLicensePlateCar(parkingSpotModel.getLicensePlateCar())){
         throw new LicensePlateInUse("Conflict: License Plate Car is already in use!");
      }
      if(this.existsByParkingSpotNumber(parkingSpotModel.getParkingSpotNumber())){
         throw new ParkingSpotInUse("Conflict: Parking Spot is already in use!");
      }
      if(this.existsByApartmentAndBlock(parkingSpotModel.getApartment(), parkingSpotModel.getBlock())){
         throw new ParkingSpotAlreadyRegistred("Conflict: Parking Spot already registered for this apartment/block!");
      }

      CarModel car = new CarModel(parkingSpotModel.getModelCar().getId());
      var id = UUID.randomUUID().toString();
      var registrationDate = LocalDateTime.now(ZoneId.of("UTC"));

      return parkingSpotRepository.save(parkingSpotModel);
   }


   public Page<ParkingSpotModel> findAll(Pageable pageable){
      return parkingSpotRepository.findAll(pageable);
   }


   public ParkingSpotModel getById(String id){
      return parkingSpotRepository.findById(id).orElseThrow(
              () -> new EntityNotFoundException());
   }


   public ParkingSpotModel update(String id, ParkingSpotModel parkingSpotModel){
      ParkingSpotModel parkingSpotReg = this.getById(id);
      parkingSpotModel.setId(parkingSpotReg.getId());
      parkingSpotModel.setRegistrationDate(parkingSpotReg.getRegistrationDate());
      return parkingSpotRepository.save(parkingSpotModel);
   }


   @Transactional
   public void delete(String id){
      ParkingSpotModel parkingSpotReg = this.getById(id);
      parkingSpotRepository.delete(parkingSpotReg);
   }



   public boolean existsByLicensePlateCar(String licensePlateCar) {
      return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
   }

   public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
      return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
   }

   public boolean existsByApartmentAndBlock(String apartment, String block) {
      return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
   }
}
