package com.sputnikgo.dto.user;

import com.sputnikgo.enums.Role;
import lombok.Data;

@Data
public class LoginRequest {
    private String phone;
    private Role role;
}
