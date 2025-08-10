package com.sputnikgo.dto.pricing;


import com.sputnikgo.enums.VehicleCategoryCode;
import lombok.Data;

@Data
public class EstimateRequest {
    private Double pickupLat;
    private Double pickupLng;
    private Double dropoffLat;
    private Double dropoffLng;
    private VehicleCategoryCode category;
}
