package com.sputnikgo.repository;

import com.sputnikgo.model.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findAllByPassengerIdOrderByCreatedAtDesc(Long passengerId);
}

