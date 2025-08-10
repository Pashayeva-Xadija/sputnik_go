package com.sputnikgo.repository;

import com.sputnikgo.model.trip.RoutePoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoutePointRepository extends JpaRepository<RoutePoint, Long> {
    List<RoutePoint> findAllByTripIdOrderBySequenceNoAsc(Long tripId);
}