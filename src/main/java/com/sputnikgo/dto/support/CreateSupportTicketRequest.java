package com.sputnikgo.dto.support;

import lombok.Data;

@Data
public class CreateSupportTicketRequest {
    private String subject;
    private String message;
}