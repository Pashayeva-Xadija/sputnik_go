package com.sputnikgo.repository;

import com.sputnikgo.model.pricing.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleCategoryRepository extends JpaRepository<VehicleCategory, Long> {
    Optional<VehicleCategory> findByCode(com.sputnikgo.enums.VehicleCategoryCode code);
}
