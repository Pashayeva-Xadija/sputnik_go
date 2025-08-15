package com.sputnikgo.dto.support;

import com.sputnikgo.enums.SupportStatus;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class SupportTicketDto {
    private Long id;
    private String subject;
    private SupportStatus status;
    private OffsetDateTime createdAt;
}
