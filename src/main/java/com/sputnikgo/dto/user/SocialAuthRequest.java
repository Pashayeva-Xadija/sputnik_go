package com.sputnikgo.dto.user;

import com.sputnikgo.enums.AuthProvider;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SocialAuthRequest {
    @NotNull
    private AuthProvider provider;
    @NotBlank
    private String idToken;
}