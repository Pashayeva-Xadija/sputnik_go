package com.sputnikgo.dto.support;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateSupportTicketRequest {
    @NotBlank
    @Size(max = 160)
    private String subject;

    @NotBlank
    private String message;
}