package com.sputnikgo.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserConsentRequest {
    @NotBlank
    private String policy;
    @NotBlank
    private String version;
}