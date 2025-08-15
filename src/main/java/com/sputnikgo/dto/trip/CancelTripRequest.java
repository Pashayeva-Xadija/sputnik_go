package com.sputnikgo.dto.trip;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CancelTripRequest {
    @NotNull
    @Positive
    private Long tripId;

    @Size(max = 255)
    private String reason;
}
