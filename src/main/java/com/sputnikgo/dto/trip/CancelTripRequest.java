package com.sputnikgo.dto.trip;

import lombok.Data;

@Data
public class CancelTripRequest {
    private Long tripId;
    private String reason;
}
