package com.sputnikgo.dto.trip;


import com.sputnikgo.enums.PaymentType;
import com.sputnikgo.enums.VehicleCategoryCode;
import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class TripRequest {
    @NotNull @DecimalMin("-90.0")  @DecimalMax("90.0")
    private Double pickupLat;

    @NotNull @DecimalMin("-180.0") @DecimalMax("180.0")
    private Double pickupLng;

    @NotNull @DecimalMin("-90.0")  @DecimalMax("90.0")
    private Double dropoffLat;

    @NotNull @DecimalMin("-180.0") @DecimalMax("180.0")
    private Double dropoffLng;

    @NotNull
    private VehicleCategoryCode category;

    @NotNull
    private PaymentType paymentType;

    @Positive
    private Long cardId;

    @Size(max = 32)
    private String promoCode;


    @Size(max = 100)
    private String riderName;

    @Pattern(regexp = "^\\+?[0-9]{7,15}$")
    private String riderPhone;
}