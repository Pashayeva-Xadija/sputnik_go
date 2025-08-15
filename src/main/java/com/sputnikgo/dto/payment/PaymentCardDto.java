package com.sputnikgo.dto.payment;

import com.sputnikgo.enums.CardStatus;
import lombok.Data;

@Data
public class PaymentCardDto {
    private Long id;
    private String brand;
    private String last4;
    private boolean isDefault;
    private CardStatus status;
}
