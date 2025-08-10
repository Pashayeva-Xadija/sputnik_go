package com.sputnikgo.repository;

import com.sputnikgo.model.trip.ScheduledTrip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduledTripRepository extends JpaRepository<ScheduledTrip, Long> {
    List<ScheduledTrip> findAllByPassengerIdAndActiveTrueOrderByScheduledForAsc(Long passengerId);
}