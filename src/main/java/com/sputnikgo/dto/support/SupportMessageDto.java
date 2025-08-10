package com.sputnikgo.dto.support;

import lombok.Data;

@Data
public class SupportMessageDto {
    private Long ticketId;
    private Long senderId;
    private String body;
}