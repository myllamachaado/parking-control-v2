package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.BrandModel;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.repositories.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BrandService {

   private final BrandRepository brandRepository;

   @Transactional
   public BrandModel save(BrandModel brand){
      return brandRepository.save(brand);
   }

   public Page<BrandModel> findAll(Pageable pageable){
      return brandRepository.findAll(pageable);
   }

   public BrandModel getById(String id){
      return brandRepository.findById(id).orElseThrow(
              () -> new EntityNotFoundException());
   }

   public BrandModel update(String id, BrandModel brand){
      BrandModel brandReg = this.getById(id);
      brand.setId(brandReg.getId());
      return this.save(brand);
   }

   @Transactional
   public void delete(String id){
      BrandModel brandReg = this.getById(id);
      brandRepository.delete(brandReg);
   }
}
