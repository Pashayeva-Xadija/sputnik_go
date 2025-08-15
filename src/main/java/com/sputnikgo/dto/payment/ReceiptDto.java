package com.sputnikgo.dto.payment;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class ReceiptDto {
    private Long id;
    private Long paymentId;
    private BigDecimal amount;
    private OffsetDateTime issuedAt;
    private String url;
}
