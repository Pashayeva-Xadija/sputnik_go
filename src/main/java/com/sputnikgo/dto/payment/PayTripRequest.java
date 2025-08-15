package com.sputnikgo.dto.payment;

import com.sputnikgo.enums.PaymentType;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayTripRequest {
    @NotNull
    @Positive
    private Long tripId;

    @NotNull
    private PaymentType type;

    @Positive
    private Long cardId;

    @NotNull
    @DecimalMin(value = "0.01")
    @Digits(integer = 12, fraction = 2)
    private BigDecimal amount;

    @Size(max = 32)
    private String promoCode;
}
