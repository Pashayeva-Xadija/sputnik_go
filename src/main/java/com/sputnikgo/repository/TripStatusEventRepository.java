package com.sputnikgo.repository;

import com.sputnikgo.model.trip.TripStatusEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripStatusEventRepository extends JpaRepository<TripStatusEvent, Long> {
    List<TripStatusEvent> findAllByTripIdOrderByOccurredAtAsc(Long tripId);
}