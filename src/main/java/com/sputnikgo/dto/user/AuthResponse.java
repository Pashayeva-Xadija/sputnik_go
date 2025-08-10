package com.sputnikgo.dto.user;

import lombok.Data;

@Data
public class AuthResponse {
    private String accessToken;
    private Long userId;
    private String fullName;
    private String phone;
}
