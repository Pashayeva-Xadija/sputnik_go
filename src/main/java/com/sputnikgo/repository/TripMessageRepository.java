package com.sputnikgo.repository;

import com.sputnikgo.model.trip.TripMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripMessageRepository extends JpaRepository<TripMessage, Long> {
    List<TripMessage> findAllByTripIdOrderByCreatedAtAsc(Long tripId);
}
