package com.sputnikgo.dto.user;

import lombok.Data;

@Data
public class OtpVerifyRequest {
    private String phone;
    private String code;
}