package com.sputnikgo.dto.trip;

import lombok.Data;
import java.time.OffsetDateTime;

@Data
public class ChatMessageDto {
    private Long tripId;
    private Long senderId;
    private String body;
    private OffsetDateTime createdAt;
}
