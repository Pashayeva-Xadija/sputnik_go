package com.sputnikgo.dto.trip;

import lombok.Data;

@Data
public class RatingRequest {
    private Long tripId;
    private Integer score;   // 1..5
    private String comment;
}
