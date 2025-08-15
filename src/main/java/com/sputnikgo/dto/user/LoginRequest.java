package com.sputnikgo.dto.user;

import com.sputnikgo.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank
    @Pattern(regexp = "^\\+?[0-9]{7,15}$")
    private String phone;
    @NotNull
    private Role role;
}
