package com.sputnikgo.dto.user;

import lombok.Data;

@Data
public class SocialAuthRequest {
    private String provider;
    private String idToken;
}