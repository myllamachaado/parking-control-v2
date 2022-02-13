package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dto.brand.BrandMapper;
import com.api.parkingcontrol.dto.car.CarDTO;
import com.api.parkingcontrol.dto.car.CarMapper;
import com.api.parkingcontrol.dto.car.RegCarDTO;
import com.api.parkingcontrol.models.BrandModel;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("v2/cars")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CarController {

   private final CarService carService;

   @PostMapping("")
   public ResponseEntity<CarDTO> saveCar(@RequestBody @Valid RegCarDTO car){
      CarModel regCar = carService.save(CarMapper.fromDTO(car));
      return ResponseEntity.ok(CarMapper.fromEntity(regCar));
   }

   @GetMapping("")
   public ResponseEntity<Page<CarDTO>> getAllCars(Pageable pageable){
      return ResponseEntity.ok(carService.findAll(pageable).map(CarMapper::fromEntity));
   }

   @GetMapping("/{id}")
   public ResponseEntity<CarDTO> getCarById(@PathVariable(value = "id") String id){
      CarModel regCar = carService.getById(id);
      return ResponseEntity.ok(CarMapper.fromEntity(regCar));
   }

   @PutMapping("/{id}")
   public ResponseEntity<CarDTO> editCar(@RequestBody @Valid RegCarDTO car,
                                                 @PathVariable(value = "id") String id){
      CarModel regCar = carService.update(id, CarMapper.fromDTO(car));
      return ResponseEntity.ok(CarMapper.fromEntity(regCar));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<CarDTO> getCar(@PathVariable @Valid String id){
      carService.delete(id);
      return ResponseEntity.ok().build();
   }

}
