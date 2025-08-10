package com.sputnikgo.dto.pricing;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EstimateResponse {
    private BigDecimal baseFare;
    private Double distanceKm;
    private Integer durationSec;
    private BigDecimal total;
    private String currency = "AZN";
}