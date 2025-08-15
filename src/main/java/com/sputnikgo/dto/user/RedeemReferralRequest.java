package com.sputnikgo.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RedeemReferralRequest {
    @NotBlank
    private String code;
}