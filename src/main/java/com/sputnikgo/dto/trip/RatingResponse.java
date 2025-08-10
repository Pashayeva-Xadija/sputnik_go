package com.sputnikgo.dto.trip;

import lombok.Data;

@Data
public class RatingResponse {
    private Long ratingId;
    private Long tripId;
    private Integer score;
}
