package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.BrandModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandModel, String> {
}
