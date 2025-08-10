package com.sputnikgo.dto.payment;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RefundRequest {
    private Long tripId;
    private Long cardId;
    private BigDecimal amount;
}