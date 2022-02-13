package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CarService {

   private final CarRepository carRepository;

   @Transactional
   public CarModel save(CarModel car){
      return carRepository.save(car);
   }

   public Page<CarModel> findAll(Pageable pageable){
      return carRepository.findAll(pageable);
   }

   public CarModel getById(String id){
      return carRepository.findById(id).orElseThrow(
              () -> new EntityNotFoundException());
   }

   public CarModel update(String id, CarModel car){
      CarModel carReg = this.getById(id);
      car.setId(carReg.getId());
      return this.save(car);
   }

   @Transactional
   public void delete(String id){
      CarModel carReg = this.getById(id);
      carRepository.delete(carReg);
   }

}
