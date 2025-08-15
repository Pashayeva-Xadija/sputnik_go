package com.sputnikgo.dto.trip;

import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class RatingRequest {
    @NotNull
    @Positive
    private Long tripId;

    @NotNull @Min(1) @Max(5)
    private Integer score;

    @Size(max = 500)
    private String comment;
}
