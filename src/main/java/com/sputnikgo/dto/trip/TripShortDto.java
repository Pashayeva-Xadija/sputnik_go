package com.sputnikgo.dto.trip;


import com.sputnikgo.enums.VehicleCategoryCode;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class TripShortDto {
    private Long id;
    private OffsetDateTime createdAt;
    private String fromAddress;
    private String toAddress;
    private VehicleCategoryCode category;
    private BigDecimal total;
}

