package com.sputnikgo.repository;

import com.sputnikgo.model.driver.DriverDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverDocumentRepository extends JpaRepository<DriverDocument, Long> {
    List<DriverDocument> findAllByDriverId(Long driverId);
}
