package com.sputnikgo.dto.payment;


import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AddCardRequest {
    @NotBlank
    @Pattern(regexp = "^\\d{12,19}$")
    private String cardNumber;

    @NotNull
    @Min(1) @Max(12)
    private Integer expMonth;

    @NotNull @Min(2024) @Max(2100)
    private Integer expYear;

    @NotBlank
    @Pattern(regexp = "^\\d{3,4}$")
    private String cvv;
}
