package com.sputnikgo.dto.promo;

import lombok.Data;

@Data
public class PromoApplyRequest {
    private Long tripId;
    private String code;
}
