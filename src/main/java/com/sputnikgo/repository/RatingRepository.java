package com.sputnikgo.repository;

import com.sputnikgo.model.rating.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findAllByTripId(Long tripId);
}
