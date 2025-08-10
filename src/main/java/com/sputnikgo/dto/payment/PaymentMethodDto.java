package com.sputnikgo.dto.payment;

import lombok.Data;

@Data
public class PaymentMethodDto {
    private String code;
    private String displayName;
    private boolean active;
}
