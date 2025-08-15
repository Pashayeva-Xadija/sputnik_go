package com.sputnikgo.dto.payment;


import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class RefundDto {
    private Long id;
    private BigDecimal amount;
    private OffsetDateTime createdAt;
}
