package com.sputnikgo.dto.support;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class SupportTicketDto {
    private Long id;
    private String subject;
    private String status;
    private OffsetDateTime createdAt;
}
