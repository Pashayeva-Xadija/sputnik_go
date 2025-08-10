package com.sputnikgo.dto.schedule;


import com.sputnikgo.enums.VehicleCategoryCode;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class ScheduledTripDto {
    private Long id;
    private Double pickupLat;
    private Double pickupLng;
    private Double dropoffLat;
    private Double dropoffLng;
    private VehicleCategoryCode category;
    private OffsetDateTime scheduledFor;
    private boolean active;
}
