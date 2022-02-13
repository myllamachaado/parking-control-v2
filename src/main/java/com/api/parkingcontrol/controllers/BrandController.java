package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dto.brand.BrandDTO;
import com.api.parkingcontrol.dto.brand.BrandMapper;
import com.api.parkingcontrol.dto.brand.RegBrandDTO;
import com.api.parkingcontrol.models.BrandModel;
import com.api.parkingcontrol.services.BrandService;
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
@RequestMapping("v2/brands")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BrandController {

   private final BrandService brandService;

   @PostMapping("")
   public ResponseEntity<BrandDTO> saveBrand(@RequestBody @Valid RegBrandDTO brand){
      BrandModel regBrand = brandService.save(BrandMapper.fromDTO(brand));
      return ResponseEntity.ok(BrandMapper.fromEntity(regBrand));
   }

   @GetMapping("")
   public ResponseEntity<Page<BrandDTO>> getAllBrands(Pageable pageable){
      return ResponseEntity.ok(brandService.findAll(pageable).map(BrandMapper::fromEntity));
   }

   @GetMapping("/{id}")
   public ResponseEntity<BrandDTO> getBrandById(@PathVariable(value = "id") String id){
      BrandModel regBrand = brandService.getById(id);
      return ResponseEntity.ok(BrandMapper.fromEntity(regBrand));
   }

   @PutMapping("/{id}")
   public ResponseEntity<BrandDTO> editBrand(@RequestBody @Valid RegBrandDTO brand,
                                                 @PathVariable(value = "id") String id){
      BrandModel regBrand = brandService.update(id, BrandMapper.fromDTO(brand));
      return ResponseEntity.ok(BrandMapper.fromEntity(regBrand));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<BrandDTO> deleteBrand(@PathVariable @Valid String id){
      brandService.delete(id);
      return ResponseEntity.ok().build();
   }
}
