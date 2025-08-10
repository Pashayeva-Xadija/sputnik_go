package com.sputnikgo.repository;

import com.sputnikgo.model.location.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    List<UserLocation> findTop10ByUserIdOrderByCapturedAtDesc(Long userId);
}
