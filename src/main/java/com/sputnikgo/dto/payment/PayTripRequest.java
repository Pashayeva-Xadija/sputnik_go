package com.sputnikgo.dto.payment;

import com.sputnikgo.enums.PaymentType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayTripRequest {
    private Long tripId;
    private PaymentType type;
    private Long cardId;
    private BigDecimal amount;
    private String promoCode;
}
