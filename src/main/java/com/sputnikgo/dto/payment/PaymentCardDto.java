package com.sputnikgo.dto.payment;

import lombok.Data;

@Data
public class PaymentCardDto {
    private Long id;
    private String brand;   // VISA, MasterCard, etc.
    private String last4;   // 1234
    private boolean isDefault;
}
