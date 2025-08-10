package com.sputnikgo.dto.trip;


import com.sputnikgo.enums.PaymentType;
import com.sputnikgo.enums.VehicleCategoryCode;
import lombok.Data;

@Data
public class TripRequest {
    private Double pickupLat;
    private Double pickupLng;
    private Double dropoffLat;
    private Double dropoffLng;
    private VehicleCategoryCode category;
    private PaymentType paymentType;
    private Long cardId;
    private String promoCode;
}