package com.sputnikgo.dto.payment;


import lombok.Data;

@Data
public class AddCardRequest {
    private String cardNumber;
    private Integer expMonth;
    private Integer expYear;
    private String cvv;
}
