package com.sputnikgo.dto.promo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Data
public class PromoApplyRequest {
    @NotNull
    @Positive
    private Long tripId;

    @NotBlank
    @Pattern(regexp = "^[A-Z0-9\\-]{3,32}$")
    private String code;
}