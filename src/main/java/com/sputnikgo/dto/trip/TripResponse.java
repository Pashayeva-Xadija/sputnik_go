package com.sputnikgo.dto.trip;


import com.sputnikgo.enums.TripStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TripResponse {
    private Long tripId;
    private TripStatus status;
    private BigDecimal estimatedPrice;
    private String driverName;
    private String vehicleModel;
    private String plateNumber;
}

