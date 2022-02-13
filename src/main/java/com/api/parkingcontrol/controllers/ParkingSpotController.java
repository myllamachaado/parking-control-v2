package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dto.parkingSpot.ParkingSpotDTO;
import com.api.parkingcontrol.dto.parkingSpot.ParkingSpotMapper;
import com.api.parkingcontrol.dto.parkingSpot.RegParkingSpotDTO;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("v2/parking-spot")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ParkingSpotController {

   private final ParkingSpotService parkingSpotService;

   @PostMapping("")
   public ResponseEntity<ParkingSpotDTO> saveParkingSpot(@RequestBody @Valid RegParkingSpotDTO parkingSpotDTO){
      ParkingSpotModel parkingSpotModel = parkingSpotService.save(ParkingSpotMapper.fromDTO(parkingSpotDTO));
      return ResponseEntity.ok(ParkingSpotMapper.fromEntity(parkingSpotModel));
   }

   @GetMapping("")
   public ResponseEntity<Page<ParkingSpotDTO>> getAllParkingSpot(Pageable pageable){
      return ResponseEntity.ok(parkingSpotService.findAll(pageable).map(ParkingSpotMapper::fromEntity));
   }

   @GetMapping("/{id}")
   public ResponseEntity<ParkingSpotDTO> getParkingSpotById(@PathVariable(value = "id") String id){
      ParkingSpotModel parkingSpotModel = parkingSpotService.getById(id);
      return ResponseEntity.ok(ParkingSpotMapper.fromEntity(parkingSpotModel));
   }

   @PutMapping("/{id}")
   public ResponseEntity<ParkingSpotDTO> editParkingSpot(@RequestBody @Valid RegParkingSpotDTO parkingSpotDTO,
                                                 @PathVariable(value = "id") String id){
      ParkingSpotModel parkingSpotModel = parkingSpotService.update(id, ParkingSpotMapper.fromDTO(parkingSpotDTO));
      return ResponseEntity.ok(ParkingSpotMapper.fromEntity(parkingSpotModel));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<ParkingSpotDTO> deleteParkingSpot(@PathVariable @Valid String id){
      parkingSpotService.delete(id);
      return ResponseEntity.ok().build();
   }

}
