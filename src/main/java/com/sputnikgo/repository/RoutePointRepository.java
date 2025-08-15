package com.sputnikgo.repository;

import com.sputnikgo.enums.RoutePointType;
import com.sputnikgo.model.trip.RoutePoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoutePointRepository extends JpaRepository<RoutePoint, Long> {
    List<RoutePoint> findAllByTripIdOrderBySequenceNoAsc(Long tripId);

    RoutePoint findFirstByTripIdAndTypeOrderBySequenceNoAsc(Long tripId, RoutePointType type);

    RoutePoint findFirstByTripIdAndTypeOrderBySequenceNoDesc(Long tripId, RoutePointType type);



}